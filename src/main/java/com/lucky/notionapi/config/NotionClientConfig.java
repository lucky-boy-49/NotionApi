package com.lucky.notionapi.config;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.service.impl.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * notion客户端配置
 *
 * @author jiahe
 */
@Slf4j
@Configuration
@RequiredArgsConstructor
public class NotionClientConfig {

    private final AuthenticateServiceImpl authenticateService;

    private final BlockServiceImpl blockService;

    private final PageServiceImpl pageService;

    private final DatabaseServiceImpl databaseService;

    private final UsersServiceImpl usersService;

    private final CommentsServiceImpl commentsService;

    private final SearchServiceImpl searchService;

    /**
     * 初始化 NotionClient
     *
     * @return Notion客户端
     */
    @Bean
    public NotionClient notionClient() {
        return new NotionClient(authenticateService, blockService, pageService, databaseService, usersService,
                commentsService, searchService);
    }

}
