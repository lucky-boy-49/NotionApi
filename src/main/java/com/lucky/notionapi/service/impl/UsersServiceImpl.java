package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.Notion;
import com.lucky.notionapi.dto.ListAllUsersDto;
import com.lucky.notionapi.mapper.NotionUsersService;
import com.lucky.notionapi.model.user.User;
import com.lucky.notionapi.service.UsersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/**
 * 用户服务
 *
 * @author jiahe
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final HttpServiceProxyFactory factory;

    /**
     * 列出所有用户
     *
     * @param startCursor 分页开始下标
     * @param pageSize    每页大小
     * @return 用户列表
     */
    @Override
    @Notion("列出所有用户")
    public ListAllUsersDto listAllUsers(String startCursor, Integer pageSize) {
        NotionUsersService client = factory.createClient(NotionUsersService.class);
        return client.listAllUsers(startCursor, pageSize).getBody();
    }

    /**
     * 检索用户
     *
     * @param userId 用户id
     * @return 用户信息
     */
    @Override
    @Notion("检索用户")
    public User retrieveUser(String userId) {
        NotionUsersService client = factory.createClient(NotionUsersService.class);
        return client.retrieveUser(userId).getBody();
    }

    /**
     * 读取令牌的机器人用户
     *
     * @return 用户信息
     */
    @Override
    @Notion("读取令牌的机器人用户")
    public User retrieveTokenBotUser() {
        NotionUsersService client = factory.createClient(NotionUsersService.class);
        return client.retrieveTokenBotUser().getBody();
    }

}
