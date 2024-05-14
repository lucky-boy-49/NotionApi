package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import com.lucky.notionapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 最后编辑的数据库属性在 Notion UI 中呈现为一列，其中包含人们提及的最后编辑每一行的人员作为值。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LastEditedByDatabaseProperties extends AbstractDatabaseProperties {

    /**
     * last_edited_by 类型对象为空。没有额外的属性配置。
     */
    @JsonProperty("last_edited_by")
    private User lastEditedBy;

}
