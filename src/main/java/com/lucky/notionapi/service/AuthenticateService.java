package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.AuthenticateRequestDao;
import com.lucky.notionapi.dao.AuthenticateResponseDao;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;

/**
 * Notion认证服务接口
 *
 * @author jiahe
 */
public interface AuthenticateService {

    /**
     * 创建第三方服务可用于通过 Notion 进行身份验证的访问令牌。<br>
     * 注意：每个公共 API 端点都可以返回多个可能的错误代码。要查看每种错误代码类型的完整说明，请参阅状态代码文档的错误代码部分。
     *
     * @param requestDao 请求参数
     * @return 响应
     */
    @PostExchange(value = "/v1/oauth/token", contentType = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AuthenticateResponseDao> createToken(@RequestBody AuthenticateRequestDao requestDao);

}
