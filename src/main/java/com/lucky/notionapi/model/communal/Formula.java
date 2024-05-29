package com.lucky.notionapi.model.communal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

/**
 * 公式
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Formula {

    /**
     * 用于计算该属性值的公式。
     */
    private String expression;

    /**
     * 指示公式结果的数据类型的字符串。可能的 type 值是
     * - boolean
     * - date
     * - number
     * - string
     * 其他属性：type为什么类型则那个属性就有值
     */
    private String type;

    @JsonProperty("boolean")
    private Boolean boo;

    private Date date;

    private Integer number;

    private String string;

}
