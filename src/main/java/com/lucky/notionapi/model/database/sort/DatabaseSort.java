package com.lucky.notionapi.model.database.sort;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * 排序是一种条件，用于对数据库查询返回的条目进行排序。数据库查询可按属性和/或时间戳以及给定方向排序
 *
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PropertySort.class),
        @JsonSubTypes.Type(value = EntryTimestampSort.class)
})
public interface DatabaseSort {
}
