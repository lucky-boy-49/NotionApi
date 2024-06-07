package com.lucky.notionapi.model.communal.richtext.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.communal.richtext.AbstractRichText;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 富文本类型对象:方程
 * Notion 支持内联 LaTeX 方程作为富文本对象
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EquationRichText extends AbstractRichText {

    /**
     * 表示内联方程的 LaTeX 字符串。
     */
    @Valid
    private Equation equation;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public EquationRichText(Boolean initType) {
        if (initType) {
            type = EQUATION;
        }
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Equation {

        public Equation(String expression) {
            this.expression = expression;
        }

        @Size(max = NotionConfig.EQUATION_EXPRESSION_SIZE, message = NotionConfig.EQUATION_EXPRESSION_MESSAGE)
        private String expression;

    }

}
