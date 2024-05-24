package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 最后编辑时间属性值<br>
 * 最后编辑时间属性值对象在 last_edited_time 属性中包含一个字符串。该字符串包含该页面最后更新的日期和时间。其格式为 ISO 8601
 * 日期时间字符串（即 "2020-03-17T19:10:04.968Z" ）。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LastEditedByPropertyDao extends AbstractPropertyItem {

    @JsonProperty("last_edited_by")
    private User lastEditedBy;

}
