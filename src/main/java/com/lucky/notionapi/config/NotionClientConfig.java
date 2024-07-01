package com.lucky.notionapi.config;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.service.*;
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

    /**
     * 认证服务
     */
    private final AuthenticateService authenticateService;

    /**
     * 块服务
     */
    private final BlockService blockService;

    /**
     * 页面服务
     */
    private final PageService pageService;

    /**
     * 数据库服务
     */
    private final DatabaseService databaseService;

    /**
     * 用户服务
     */
    private final UsersService usersService;

    /**
     * 评论服务
     */
    private final CommentsService commentsService;

    /**
     * 搜索服务
     */
    private final SearchService searchService;

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
