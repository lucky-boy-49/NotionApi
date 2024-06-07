package com.lucky.notionapi.utils;

import com.lucky.notionapi.dao.AuthenticateDao;
import com.lucky.notionapi.exception.CreateEntityException;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock1;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock2;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock3;
import com.lucky.notionapi.model.communal.richtext.Annotation;
import com.lucky.notionapi.model.communal.richtext.type.TextRichText;
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

    /**
     * 创建一个没有如何格式的标题
     *
     * @param level   标题等级，只能为1、2、3
     * @param content 内容
     * @return 标题块
     */
    public static BlockType createHeadingBlock(int level, String content) {
        TextRichText richText = createTextRichText(content);
        return createHeadingBlock(level, richText);
    }

    /**
     * 创建标题块
     *
     * @param level    标题等级，只能为1、2、3
     * @param richText 富文本对象
     * @return 标题块
     */
    public static BlockType createHeadingBlock(int level, TextRichText richText) {

        switch (level) {
            case 1: {
                HeadingBlock1 res = new HeadingBlock1();
                res.setHeading1(new HeadingBlock1.Heading1());
                res.getHeading1().setRichText(new TextRichText[]{richText});
                return res;
            }
            case 2: {
                HeadingBlock2 res = new HeadingBlock2();
                res.setHeading2(new HeadingBlock2.Heading2());
                res.getHeading2().setRichText(new TextRichText[]{richText});
                return res;
            }
            case 3: {
                HeadingBlock3 res = new HeadingBlock3();
                res.setHeading3(new HeadingBlock3.Heading3());
                res.getHeading3().setRichText(new TextRichText[]{richText});
                return res;
            }
            default:
                throw new CreateEntityException("创建标题块时，标题等级只能为1、2、3");
        }

    }

    /**
     * 创建一个没有如何格式的文本形式的富文本对象
     *
     * @param content 内容
     * @return 富文本对象
     */
    public static TextRichText createTextRichText(String content) {
        return new TextRichText(content);
    }

    /**
     * 创建一个带有链接的文本形式的富文本对象
     *
     * @param content 内容
     * @param link    连接
     * @return 富文本对象
     */
    public static TextRichText createTextRichText(String content, String link) {
        TextRichText result = createTextRichText(content);
        result.getText().setLink(new TextRichText.Text.Link(link));
        return result;
    }

    /**
     * 创建一个带有链接和格式的文本形式的富文本对象
     *
     * @param content    内容
     * @param link       连接
     * @param annotation 格式
     * @return 富文本对象
     */
    public static TextRichText createTextRichText(String content, String link, Annotation annotation) {
        TextRichText result = createTextRichText(content, link);
        result.setAnnotations(annotation);
        return result;
    }

    /**
     * 创建一个有格式的文本形式的富文本对象
     *
     * @param content    内容
     * @param annotation 格式
     * @return 富文本对象
     */
    public static TextRichText createTextRichText(String content, Annotation annotation) {
        TextRichText result = createTextRichText(content);
        result.setAnnotations(annotation);
        return result;
    }

}
