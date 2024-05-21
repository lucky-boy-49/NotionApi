package com.lucky.notionapi.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nonnull;
import lombok.Data;

/**
 * 创建一个令牌的请求对象
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthenticateRequestDao {

    /**
     * Notion 生成的唯一随机代码，用于对您的服务进行身份验证，在用户启动 OAuth 流程时生成。
     */
    @Nonnull
    private String code;

    /**
     * 常量字符串：“authorization_code”。
     */
    @Nonnull
    @JsonProperty("grant_type")
    private String grantType;

    /**
     * 集成授权设置的 OAuth 域和 URI 部分中提供的 "redirect_uri" 。如果向用户提供的授权 URL <br>
     * 中未包含 "redirect_uri" 查询参数，请勿包含此字段。在大多数情况下，该字段是必需的。
     */
    @Nonnull
    @JsonProperty("redirect_uri")
    private String redirectUri;

    private ExternalAccount externalAccount;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ExternalAccount {

        private String key;

        private String name;

    }

}
