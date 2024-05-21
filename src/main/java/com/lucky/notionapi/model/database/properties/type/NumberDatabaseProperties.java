package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数字
 * 数字数据库属性在 Notion UI 中呈现为包含数值的列。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberDatabaseProperties extends AbstractDatabaseProperties {

    /**
     * 更新数据序列化时使用
     */
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Integer number;

    /**
     * 获取数据，反序列化使用
     */
    @JsonProperty(value = "number", access = JsonProperty.Access.WRITE_ONLY)
    private Number number2;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Number {

        private String format;

    }

}
