package com.lucky.notionapi.service;

import com.lucky.notionapi.dto.ListAllUsersDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

/**
 * Notion 用户服务<br>
 * 列出所有用户、检索用户、读取令牌的机器人用户
 *
 * @author jiahe
 */
@HttpExchange("/v1/users")
public interface UsersService {

    /**
     * 返回工作区的分页用户列表。响应可能包含少于 {@code pageSize} 的结果。
     *
     * @param startCursor 分页游标
     * @param pageSize    每页的用户数量
     * @return 用户列表
     */
    @GetExchange
    ResponseEntity<ListAllUsersDto> listAllUsers(@RequestParam(value = "start_cursor", required = false) String startCursor,
                                                 @RequestParam(value = "start_cursor", required = false) Integer pageSize);

}
