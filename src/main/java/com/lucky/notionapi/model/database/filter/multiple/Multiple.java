package com.lucky.notionapi.model.database.filter.multiple;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.database.filter.DatabaseFilter;

/**
 * 可以使用 and 和 or 键连锁过滤器，以便同时应用多个过滤器。嵌套最多支持两层。
 *
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(value = AndMultiple.class),
        @JsonSubTypes.Type(value = OrMultiple.class),
})
public interface Multiple extends DatabaseFilter {
}
