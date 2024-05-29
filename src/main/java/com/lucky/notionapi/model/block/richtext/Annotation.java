package com.lucky.notionapi.model.block.richtext;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.enumerate.ColorEnum;
import lombok.Data;

/**
 * 注释对象
 * 所有富文本对象都包含一个 Annotation 对象，用于设置富文本的样式。
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Annotation {

    /**
     * 文本是否加粗。
     */
    private Boolean bold;

    /**
     * 文本是否斜体。
     */
    private Boolean italic;

    /**
     * 文本是否被删除。
     */
    private Boolean strikethrough;

    /**
     * 文本是否带下划线。
     */
    private Boolean underline;

    /**
     * 文本是否为代码类型。
     */
    private Boolean code;

    /**
     * 文本的颜色。
     * @see ColorEnum
     */
    private String color;

}
