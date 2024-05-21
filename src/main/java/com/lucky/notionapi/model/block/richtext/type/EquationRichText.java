package com.lucky.notionapi.model.block.richtext.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.block.richtext.AbstractRichText;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 富文本类型对象:方程
 * Notion 支持内联 LaTeX 方程作为富文本对象
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquationRichText extends AbstractRichText {

    /**
     * 表示内联方程的 LaTeX 字符串。
     */
    private Equation equation;

    public EquationRichText() {
        type = EQUATION;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Equation {

        private String expression;

    }

}
