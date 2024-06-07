package com.lucky.notionapi.service;

import com.lucky.notionapi.dto.ListAllUsersDto;
import com.lucky.notionapi.model.user.User;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

/**
 * 用户服务
 * @author jiahe
 */
@Validated
public interface UsersService {

    @Validated
    ListAllUsersDto listAllUsers(@Nullable String startCursor, @Nullable Integer pageSize);

    @Validated
    User retrieveUser(@Valid String userId);

    User retrieveTokenBotUser();

}
