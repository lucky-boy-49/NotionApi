package com.lucky.notionapi.model.block.richtext.type;

import com.lucky.notionapi.enumerate.MentionType;
import com.lucky.notionapi.model.block.richtext.RichTextStyle;
import com.lucky.notionapi.model.block.richtext.type.mention.MentionStyle;
import lombok.Data;

/**
 * 富文本类型对象:提到
 * 提及对象表示数据库、日期、链接预览提及、页面、模板提及或用户的内联提及。当用户键入 @ 后跟参考名称时，会在 Notion UI 中创建提及。
 * @author jiahe
 */
@Data
public class Mention implements RichTextStyle {

    /**
     * 内联提及的类型。可能的值包括：{@link MentionType}
     */
    private String type;

    /**
     * 包含特定于类型的配置的对象。
     */
    private MentionStyle style;

}
