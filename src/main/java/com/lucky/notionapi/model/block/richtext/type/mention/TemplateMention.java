package com.lucky.notionapi.model.block.richtext.type.mention;

import lombok.Data;

/**
 * 模板提及类型对象
 * Notion UI 中模板按钮内的内容可以包括占位符日期和用户提及，这些内容会在复制模板时填充。模板提及类型对象包含这些填充值。
 * 模板提及富文本对象包含一个 template_mention 对象，该对象具有嵌套的 type 键，该键为 "template_mention_date"
 * 或 "template_mention_user" 。
 * @author jiahe
 */
@Data
public class TemplateMention implements MentionStyle {

    /**
     * 如果 type 键为 "template_mention_date" 则{@link #value}可能为可能的值包括： "today" 和 "now" 。
     * 如果 type 键为 "template_mention_user" 则{@link #value}可能的值是 "me" 。
     */
    private String type;

    private String value;

}
