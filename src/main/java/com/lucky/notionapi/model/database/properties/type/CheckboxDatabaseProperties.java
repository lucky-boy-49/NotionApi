package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.Checkbox;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 复选框数据库属性在 Notion UI 中呈现为包含复选框的列。 checkbox 类型对象为空；没有额外的属性配置。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckboxDatabaseProperties extends AbstractDatabaseProperties {

    private Checkbox checkbox;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public CheckboxDatabaseProperties(Boolean initType) {
        if (initType) {
            type = CHECKBOX;
        }
    }

}
