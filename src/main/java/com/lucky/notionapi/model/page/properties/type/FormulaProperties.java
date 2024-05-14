package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 公式
 * 属性值对象表示评估公式中描述的结果
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FormulaProperties extends AbstractProperties {

    private Formula formula;

    @Data
    static class Formula {

        /**
         * 指示公式结果的数据类型的字符串。
         * 其他属性：type为什么类型则那个属性就有值
         */
        private String type;

        @JsonProperty("boolean")
        private Boolean boo;

        private Date date;

        private Integer number;

        private String string;

    }

}
