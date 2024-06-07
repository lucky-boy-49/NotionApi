package com.lucky.notionapi.util;

import com.lucky.notionapi.config.NotionConfigProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;

/**
 * http header util
 *
 * @author jiahe
 */
@RequiredArgsConstructor
public class HttpHeaderUtils {

    private final NotionConfigProperties configProperties;

    public HttpHeaders getDefaultHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json; charset=utf-8");
        headers.set("Notion-Version", configProperties.getVersion());
        headers.set("Authorization", configProperties.getToken());
        return headers;
    }

}
