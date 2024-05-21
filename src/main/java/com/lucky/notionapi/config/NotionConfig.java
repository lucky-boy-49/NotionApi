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
                .filter(ExchangeFilterFunction.ofResponseProcessor(clientResponse -> {
                    if (clientResponse.statusCode().isError()) {
                        return clientResponse.bodyToMono(ErrorDao.class)
                                .flatMap(ErrorDao -> Mono.error(new NotionResponseException(clientResponse.statusCode().value(), ErrorDao)));
                    }
                    return Mono.just(clientResponse);
                }))
                .build();
        return HttpServiceProxyFactory.builderFor(WebClientAdapter.create(client)).build();
    }

}
