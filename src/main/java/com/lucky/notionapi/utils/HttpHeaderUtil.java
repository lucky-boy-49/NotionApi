package com.lucky.notionapi.utils;

import com.lucky.notionapi.config.NotionConfigProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;

/**
 * http header util
 *
 * @author jiahe
 */
@RequiredArgsConstructor
public class HttpHeaderUtil {

    private final NotionConfigProperties configProperties;

    public HttpHeaders getDefaultHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("Notion-Version", configProperties.getVersion());
        headers.set("Authorization", configProperties.getToken());
        return headers;
    }

}
