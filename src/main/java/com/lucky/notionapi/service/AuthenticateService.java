package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.AuthenticateRequestDao;
import com.lucky.notionapi.dao.AuthenticateResponseDao;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

/**
 * 认证服务接口
 * @author jiahe
 */
@Validated
public interface AuthenticateService {

    @Validated
    AuthenticateResponseDao createToken(@Valid AuthenticateRequestDao requestDao);

}
