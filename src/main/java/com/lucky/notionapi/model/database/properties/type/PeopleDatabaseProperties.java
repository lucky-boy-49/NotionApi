package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import com.lucky.notionapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 人员数据库属性在 Notion UI 中呈现为包含人员提及的列。 people 类型对象为空；没有额外的配置。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PeopleDatabaseProperties extends AbstractDatabaseProperties {

    /**
     * 用户对象的数组。
     */
    @JsonProperty("people")
    private User[] people;

}
