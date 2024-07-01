package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.AuthenticateDao;
import com.lucky.notionapi.dto.AuthenticateDto;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;

/**
 * 认证服务接口
 * @author jiahe
 */
@Validated
public interface AuthenticateService {

    /**
     * 创建token
     *
     * @param requestDao 请求参数
     * @return token
     */
    @Validated
    AuthenticateDto createToken(@Valid AuthenticateDao requestDao);

}
