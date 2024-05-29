package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.communal.LastEditedTime;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 上次编辑时间数据库属性在 Notion UI 中呈现为一列，其中包含每行上次编辑时间的时间戳作为值。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LastEditedTimeDatabaseProperties extends AbstractDatabaseProperties {

    /**
     * last_edited_time 类型对象为空。没有额外的属性配置。
     */
    @JsonProperty("last_edited_time")
    private LastEditedTime lastEditedTime;

}
