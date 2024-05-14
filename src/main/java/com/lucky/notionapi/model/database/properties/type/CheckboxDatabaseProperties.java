package com.lucky.notionapi.model.database.properties.type;

import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 复选框数据库属性在 Notion UI 中呈现为包含复选框的列。 checkbox 类型对象为空；没有额外的属性配置。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CheckboxDatabaseProperties extends AbstractDatabaseProperties {

    private Checkbox checkbox;

    @Data
    static class Checkbox {

    }

}
