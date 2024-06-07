package com.lucky.notionapi.service;

import com.lucky.notionapi.dto.AuthenticateDto;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

/**
 * 认证服务接口
 * @author jiahe
 */
@Validated
public interface AuthenticateService {

    @Validated
    AuthenticateDto createToken(@Valid com.lucky.notionapi.dao.AuthenticateDao requestDao);

}
