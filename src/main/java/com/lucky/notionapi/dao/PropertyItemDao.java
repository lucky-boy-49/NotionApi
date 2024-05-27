package com.lucky.notionapi.dao;

/**
 * 页面属性项
 *
 * @author jiahe
 */

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.dao.propertyitem.PaginatedProperty;
import com.lucky.notionapi.dao.propertyitem.PropertyItem;

@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PaginatedProperty.class),
        @JsonSubTypes.Type(value = PropertyItem.class),
})
public interface PropertyItemDao {
}
