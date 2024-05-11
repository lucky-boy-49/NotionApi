package com.lucky.notionapi.model.block.richtext.type;

import com.lucky.notionapi.model.block.richtext.RichTextStyle;
import lombok.Data;

/**
 * 富文本类型对象:方程
 * Notion 支持内联 LaTeX 方程作为富文本对象
 * @author jiahe
 */
@Data
public class Equation implements RichTextStyle {

    /**
     * 表示内联方程的 LaTeX 字符串。
     */
    private String expression;

}
