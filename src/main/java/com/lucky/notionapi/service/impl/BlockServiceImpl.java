package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.dao.AuthenticateRequestDao;
import com.lucky.notionapi.dao.AuthenticateResponseDao;
import com.lucky.notionapi.service.AuthenticateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

import java.util.Objects;

/**
 * 块服务
 *
 * @author jiahe
 */
@Slf4j
@RequiredArgsConstructor
public class BlockServiceImpl {

    private final HttpServiceProxyFactory factory;

    public AuthenticateResponseDao appendBlockChildren(AuthenticateRequestDao requestDao) {
        log.info("创建Token：{}", requestDao.toString());
        AuthenticateService service = factory.createClient(AuthenticateService.class);
        ResponseEntity<AuthenticateResponseDao> token = service.createToken(requestDao);
        AuthenticateResponseDao result = Objects.requireNonNull(token.getBody());
        log.info("创建Token成功：{}", result);
        return result;
    }

}
