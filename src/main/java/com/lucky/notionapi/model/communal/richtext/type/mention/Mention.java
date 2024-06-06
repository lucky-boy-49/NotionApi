package com.lucky.notionapi.model.communal.richtext.type.mention;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.block.BlockType;

import static com.lucky.notionapi.model.communal.richtext.type.mention.Mention.*;


/**
 *
 * @author 贺佳
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @Type(value = DatabaseMention.class, name = DATABASE),
        @Type(value = DateMention.class, name = DATE),
        @Type(value = LinkPreviewMention.class, name = LINK_PREVIEW),
        @Type(value = PageMention.class, name = PAGE),
        @Type(value = TemplateMention.class, name = TEMPLATE_MENTION),
        @Type(value = UserMention.class, name = USER),
})
public interface Mention extends BlockType {


    /**
     * 数据库提及类型对象
     */
    String DATABASE = "database";
    /**
     * 日期提及类型对象
     */
    String DATE = "date";
    /**
     * 链接预览提及类型对象
     */
    String LINK_PREVIEW = "link_preview";
    /**
     * 页面提及类型对象
     */
    String PAGE = "page";
    /**
     * 模板提及类型对象
     */
    String TEMPLATE_MENTION = "template_mention";
    /**
     * 用户提及类型对象
     */
    String USER = "user";

}
