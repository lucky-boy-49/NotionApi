package com.lucky.notionapi.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.database.Database;
import com.lucky.notionapi.model.page.Page;
import org.springframework.validation.annotation.Validated;

/**
 * 当Notion返回对象为页或者数据库混合形式时使用
 *
 * @author jiahe
 */
@Validated
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Page.class),
        @JsonSubTypes.Type(value = Database.class)
})
public interface PageOrDatabase {
}
