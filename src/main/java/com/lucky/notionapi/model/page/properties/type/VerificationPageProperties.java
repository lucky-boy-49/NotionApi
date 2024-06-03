package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.Verification;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 认证<br>
 * 数据库中页面的验证状态。页面可以经过验证或未经验证，并且验证可以设置可选的到期日期。<br>
 * 目前无法通过公共 API 设置或更新验证状态。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerificationPageProperties extends AbstractPageProperties {

    private Verification verification;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public VerificationPageProperties(Boolean initType) {
        if (initType) {
            type = VERIFICATION;
        }
    }

}
