package com.lucky.notionapi.utils;

import com.lucky.notionapi.dao.AuthenticateDao;
import org.springframework.util.StringUtils;

/**
 * 创建实体工具类
 *
 * @author jiahe
 */
public class CreateEntityUtil {

    /**
     * 创建认证对象
     *
     * @param code        Notion 生成的唯一随机码，用于与您的服务进行身份验证，在用户启动 OAuth 流程时生成。必须项。
     * @param grantType   常量字符串："authorization_code"。必须的。
     * @param redirectUri 在集成的授权设置的 OAuth 域和 URI 部分中提供的 "redirect_uri" 。如果在提供给用户的授权 URL 中未包含
     *                    "redirect_uri" 查询参数，则不要包含此字段。在大多数情况下，此字段为必填字段。
     * @param key         外部账户的唯一标识符。
     * @param name        外部账户的名称。
     * @return 认证对象
     */
    public static AuthenticateDao createAuthenticateDao(String code, String grantType, String redirectUri,
                                                        String key, String name) {

        AuthenticateDao result = createAuthenticateDao(code, grantType, redirectUri);

        if (StringUtils.hasText(key) && StringUtils.hasText(name)) {
            AuthenticateDao.ExternalAccount externalAccount = new AuthenticateDao.ExternalAccount();
            externalAccount.setKey(key);
            externalAccount.setName(name);
            result.setExternalAccount(externalAccount);
        }

        return result;

    }

    /**
     * 创建认证对象
     *
     * @param code        Notion 生成的唯一随机码，用于与您的服务进行身份验证，在用户启动 OAuth 流程时生成。必须项。
     * @param grantType   常量字符串："authorization_code"。必须的。
     * @param redirectUri 在集成的授权设置的 OAuth 域和 URI 部分中提供的 "redirect_uri" 。如果在提供给用户的授权 URL 中未包含
     *                    "redirect_uri" 查询参数，则不要包含此字段。在大多数情况下，此字段为必填字段。
     * @return 认证对象
     */
    public static AuthenticateDao createAuthenticateDao(String code, String grantType, String redirectUri) {

        AssertUtil.isNotNull(code, "创建认证对象时，Notion 生成的唯一随机码不能为空");
        AssertUtil.isNotNull(redirectUri, "创建认证对象时，重定向URL不能为空");

        AuthenticateDao result = new AuthenticateDao();

        result.setCode(code);
        result.setRedirectUri(redirectUri);

        if (StringUtils.hasText(grantType) && "authorization_code".equals(grantType)) {
            result.setGrantType(grantType);
        } else {
            result.setGrantType("authorization_code");
        }

        return result;

    }

}
