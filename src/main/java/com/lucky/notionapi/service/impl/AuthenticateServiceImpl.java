package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.dao.AuthenticateDao;
import com.lucky.notionapi.dto.AuthenticateDto;
import com.lucky.notionapi.mapper.NotionAuthenticateService;
import com.lucky.notionapi.service.AuthenticateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.Objects;

/**
 * 认证服务
 * @author jiahe
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class AuthenticateServiceImpl implements AuthenticateService {

    private final HttpServiceProxyFactory factory;

    /**
     * 创建第三方服务可用于通过 Notion 进行身份验证的访问令牌。
     * @param requestDao 请求参数
     * @return 响应结果
     */
    @Override
    public AuthenticateDto createToken(AuthenticateDao requestDao) {
        log.info("创建Token：{}", requestDao.toString());
        NotionAuthenticateService service = factory.createClient(NotionAuthenticateService.class);
        ResponseEntity<AuthenticateDto> token = service.createToken(requestDao);
        AuthenticateDto result = Objects.requireNonNull(token.getBody());
        log.info("创建Token成功：{}", result);
        return result;
    }

}
