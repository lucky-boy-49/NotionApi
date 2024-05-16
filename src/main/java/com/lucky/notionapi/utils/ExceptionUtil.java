package com.lucky.notionapi.utils;

import com.lucky.notionapi.dao.ErrorDao;
import com.lucky.notionapi.exception.authenticate.NotionResponseException;
import org.springframework.web.reactive.function.client.ClientResponse;
import reactor.core.publisher.Mono;

/**
 * 异常处理工具
 *
 * @author jiahe
 */
public class ExceptionUtil {

    public static Mono<NotionResponseException> getNotionResponseException(ClientResponse response) {
        Mono<ErrorDao> body = response.bodyToMono(ErrorDao.class);
        return Mono.error(new NotionResponseException(body));
    }

}
