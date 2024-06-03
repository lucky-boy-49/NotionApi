package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.communal.Email;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 邮箱
 *
 * @author 贺佳
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmailPageProperties extends AbstractPageProperties {

    /**
     * 在获取页面请求中返回的 email 页面属性值
     */
    @JsonProperty(value = "email", access = JsonProperty.Access.WRITE_ONLY)
    private String email;

    /**
     * 创建或更新 email 页面属性值的 POST 或 PATCH 页面请求
     */
    @JsonProperty(value = "email", access = JsonProperty.Access.READ_ONLY)
    private Email emailObject;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public EmailPageProperties(Boolean initType) {
        if (initType) {
            type = EMAIL;
        }
    }

}
