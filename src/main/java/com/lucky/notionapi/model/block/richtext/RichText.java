package com.lucky.notionapi.model.block.richtext;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.RichTextType;
import lombok.Data;

/**
 * Notion 使用富文本来允许用户自定义其内容。富文本是指一种文档类型，其中内容可以通过多种可自定义的方式进行样式和格式设置。这包括样式决策，
 * 例如斜体、字体大小和字体颜色的使用，以及格式设置，例如超链接或代码块的使用。Notion 在块对象中包含富文本对象，以指示如何表示页面中的块。
 * 支持富文本的块将包含富文本对象；但是，并非所有块类型都提供富文本。当使用检索块或检索块子端点从页面检索块时，富文本对象数组将包含在块对象中
 * （如果可用）。开发人员可以使用此数组检索块的纯文本 ( plain_text )，或获取应用于块的所有富文本样式和格式选项。
 * @author jiahe
 */
@Data
public class RichText {

    /**
     * 该富文本对象的类型。可能的类型值为： "text" 、 "mention" 、 "equation" 。
     * @see RichTextType
     */
    private String type;

    /**
     * 包含特定于类型的配置的对象。
     */
    private RichTextStyle style;

    /**
     * 用于设置富文本对象样式的信息。
     */
    private Annotation annotations;

    /**
     * 没有注释的纯文本。
     */
    @JsonProperty("plain_text")
    private String plainText;

    /**
     * 本文中提到的任何链接或概念的 URL（如果有）。
     */
    private String href;

}
