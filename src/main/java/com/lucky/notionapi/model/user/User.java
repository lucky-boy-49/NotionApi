package com.lucky.notionapi.model.user;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.user.type.Bots;
import com.lucky.notionapi.model.user.type.People;

/**
 * User 对象代表 Notion 工作区中的用户。用户包括完整的工作区成员、访客和集成。
 * 用户对象几乎出现在 API 返回的所有对象中，包括：
 * 1.块对象{@link AbstractBlock}
 * 2.页面对象中的created_by 和 last_edited_by 以及 people 属性项
 * 3.数据库对象中的created_by 和 last_edited_by
 * 4.富文本对象中的用户提到
 * 5.属性对象中的 people 属性
 * 用户对象将始终包含 object 和 id 键
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true, defaultImpl = People.class,
        include = JsonTypeInfo.As.EXISTING_PROPERTY)
@JsonSubTypes({
        @Type(value = People.class, name = "person"),
        @Type(value = Bots.class, name = "bot")
})
public interface User {
}
