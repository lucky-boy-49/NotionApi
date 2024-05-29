package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.communal.Email;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 邮箱
 *
 * @author 贺佳
 */
@Data
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

    public EmailPageProperties() {
        type = EMAIL;
    }

}
