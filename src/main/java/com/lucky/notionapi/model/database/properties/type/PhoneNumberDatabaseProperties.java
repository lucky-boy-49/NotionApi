package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.communal.PhoneNumber;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 电话号码数据库属性在 Notion UI 中呈现为包含电话号码值的列。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PhoneNumberDatabaseProperties extends AbstractDatabaseProperties {

    @JsonProperty("phone_number")
    private PhoneNumber phoneNumber;

}
