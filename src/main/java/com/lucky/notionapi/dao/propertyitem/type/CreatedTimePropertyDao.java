package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 创建时间属性值<br>
 * 创建时间属性值对象在 created_time 属性中包含一个字符串。该字符串包含创建该页面的日期和时间。其格式为 ISO 8601 日期时间字符串（即 "2020-03-17T19:10:04.968Z" ）。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatedTimePropertyDao extends AbstractPropertyItem {

    @JsonProperty("created_time")
    private String createdTime;

}
