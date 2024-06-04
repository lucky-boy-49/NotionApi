package com.lucky.notionapi.model.database.filter;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.database.filter.conditions.FilterObject;
import com.lucky.notionapi.model.database.filter.multiple.Multiple;

/**
 * 搜索数据库过滤器
 *
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(value = FilterObject.class),
        @JsonSubTypes.Type(value = Multiple.class),
})
public interface DatabaseFilter {
}
