package com.lucky.notionapi;

import com.lucky.notionapi.config.NotionConfigProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties(NotionConfigProperties.class)
public class NotionClient {

}
