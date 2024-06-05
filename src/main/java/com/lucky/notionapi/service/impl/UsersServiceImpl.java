package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.Notion;
import com.lucky.notionapi.dto.ListAllUsersDto;
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
public class UsersServiceImpl {

    private final HttpServiceProxyFactory factory;

    /**
     * 列出所有用户
     *
     * @param startCursor 分页开始下标
     * @param pageSize    每页大小
     * @return 用户列表
     */
    @Notion("列出所有用户")
    public ListAllUsersDto listAllUsers(String startCursor, Integer pageSize) {
        UsersService client = factory.createClient(UsersService.class);
        return client.listAllUsers(startCursor, pageSize).getBody();
    }

}
