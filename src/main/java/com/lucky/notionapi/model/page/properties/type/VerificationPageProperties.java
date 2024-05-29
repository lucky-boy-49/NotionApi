package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.Verification;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 认证<br>
 * 数据库中页面的验证状态。页面可以经过验证或未经验证，并且验证可以设置可选的到期日期。<br>
 * 目前无法通过公共 API 设置或更新验证状态。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerificationPageProperties extends AbstractPageProperties {

    private Verification verification;

    public VerificationPageProperties() {
        type = VERIFICATION;
    }

}
