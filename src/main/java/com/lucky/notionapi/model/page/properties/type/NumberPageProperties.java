package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 数字
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class NumberPageProperties extends AbstractPageProperties {

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
    static class Number {

        private String format;

    }

}
