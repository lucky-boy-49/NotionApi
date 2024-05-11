package com.lucky.notionapi.model.block.richtext.type;

import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;

/**
 * 富文本类型对象:方程
 * Notion 支持内联 LaTeX 方程作为富文本对象
 * @author jiahe
 */
@Data
public class EquationRichText implements RichTextType {

    private String type;

    /**
     * 表示内联方程的 LaTeX 字符串。
     */
    private Equation equation;

    @Data
    static class Equation {

        private String expression;

    }

}
