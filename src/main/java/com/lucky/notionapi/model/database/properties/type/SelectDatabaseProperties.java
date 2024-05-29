package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.Select;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 选择数据库属性在 Notion UI 中呈现为包含来自选项选择的值的列。每行仅允许一个选项。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SelectDatabaseProperties extends AbstractDatabaseProperties {

    private Select select;

}
