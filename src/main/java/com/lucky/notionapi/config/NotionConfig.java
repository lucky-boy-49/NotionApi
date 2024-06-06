package com.lucky.notionapi.config;

import com.lucky.notionapi.dao.ErrorDao;
import com.lucky.notionapi.exception.NotionResponseException;
import com.lucky.notionapi.utils.HttpHeaderUtil;
import io.netty.channel.ChannelOption;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ReactorResourceFactory;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import org.springframework.web.util.DefaultUriBuilderFactory;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;
import java.util.function.Function;

/**
 * notion 配置
 *
 * @author jiahe
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(NotionConfigProperties.class)
public class NotionConfig {

    /**
     * 富文本对象内容限制
     */
    public static final int TEXT_CONTENT_SIZE = 2000;
    /**
     * 富文本对象内容限制
     */
    public static final String TEXT_CONTENT_MESSAGE = "富文本对象内容不超过2000个字符";
    /**
     * 富文本对象链接限制
     */
    public static final int TEXT_LINK_URL_SIZE = 2000;
    /**
     * 富文本对象链接限制
     */
    public static final String TEXT_LINK_URL_MESSAGE = "富文本对象的链接不超过2000个字符";
    /**
     * 数学公式限制
     */
    public static final int EQUATION_EXPRESSION_SIZE = 1000;
    /**
     * 数学公式限制
     */
    public static final String EQUATION_EXPRESSION_MESSAGE = "数学公式对象的表达式不超过1000个字符";
    /**
     * 块类型的任意数组限制，包括富文本对象
     */
    public static final int BLOCK_ARRAY_SIZE = 100;
    /**
     * 块类型的任意数组限制，包括富文本对象
     */
    public static final String BLOCK_ARRAY_MESSAGE = "所有块类型的任意数组，包括富文本对象，数组不超过100个";
    /**
     * 任何URL限制
     */
    public static final int ANY_URL_SIZE = 2000;
    /**
     * 任何URL限制
     */
    public static final String ANY_URL_MESSAGE = "任何URL不能超过2000个字符";
    /**
     * 任何电子邮件限制
     */
    public static final int ANY_EMAIL_SIZE = 200;
    /**
     * 任何电子邮件限制
     */
    public static final String ANY_EMAIL_MESSAGE = "任何电子邮件不能超过200个字符";
    /**
     * 如何电话号码限制
     */
    public static final int ANY_PHONE_NUMBER_SIZE = 200;
    /**
     * 如何电话号码限制
     */
    public static final String ANY_PHONE_NUMBER_MESSAGE = "任何电话号码不能超过200个字符";
    /**
     * 任何多选限制
     */
    public static final int ANY_MULTI_SELECT_SIZE = 100;
    /**
     * 任何多选限制
     */
    public static final String ANY_MULTI_SELECT_MESSAGE = "任何多选不能超过100个选项";
    /**
     * 任何关系限制
     */
    public static final int ANY_RELATION_SIZE = 100;
    /**
     * 任何关系限制
     */
    public static final String ANY_RELATION_MESSAGE = "任何关系不能超过100个关系";
    /**
     * 任何人限制
     */
    public static final int ANY_PEOPLE_SIZE = 100;
    /**
     * 任何人限制
     */
    public static final String ANY_PEOPLE_MESSAGE = "任何人不能超过100个用户";

    private final NotionConfigProperties notionConfigProps;

    /**
     * 管理 Reactor Netty 资源
     *
     * @return Reactor Netty资源管理器
     */
    @Bean
    public ReactorResourceFactory resourceFactory() {
        return new ReactorResourceFactory();
    }

    /**
     * 请求头bean
     *
     * @return 请求头
     */
    @Bean
    public HttpHeaders httpHeader() {
        return new HttpHeaderUtil(notionConfigProps).getDefaultHeaders();
    }

    /**
     * 创建ClientHttpConnector
     *
     * @return HttpServiceProxyFactory
     */
    @Bean()
    public HttpServiceProxyFactory httpServiceProxyFactory() {

        DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory(notionConfigProps.getBaseUrl());
        factory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.NONE);

        Function<HttpClient, HttpClient> mapper = client -> client
                // 设置响应超时时间
                .responseTimeout(Duration.ofSeconds(30))
                // 设置连接超时时间
                .option(ChannelOption.CONNECT_TIMEOUT_MILLIS, 10000);

        ClientHttpConnector connector =
                new ReactorClientHttpConnector(resourceFactory(), mapper);

        WebClient client = WebClient.builder()
                // 设置请求地址
                .baseUrl(notionConfigProps.getBaseUrl())
                // 设置默认请求头
                .defaultHeaders(httpHeaders -> httpHeaders.addAll(httpHeader()))
                .clientConnector(connector)
                .uriBuilderFactory(factory)
                .filter(ExchangeFilterFunction.ofResponseProcessor(clientResponse -> {
                    if (clientResponse.statusCode().isError()) {
                        return clientResponse.bodyToMono(ErrorDao.class)
                                .flatMap(errorDao -> Mono.error(new NotionResponseException(clientResponse.statusCode().value(), errorDao)));
                    }
                    return Mono.just(clientResponse);
                }))
                .build();
        return HttpServiceProxyFactory.builderFor(WebClientAdapter.create(client)).build();
    }

}
