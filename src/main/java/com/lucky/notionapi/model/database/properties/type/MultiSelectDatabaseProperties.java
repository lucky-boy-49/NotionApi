package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.communal.MultiSelect;
import com.lucky.notionapi.model.communal.Options;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 多选
 * 多选数据库属性在 Notion UI 中呈现为包含一系列选项中的值的列。每一行可以包含一个或多个选项。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiSelectDatabaseProperties extends AbstractDatabaseProperties {

    /**
     * 更新时使用
     */
    @JsonProperty(value = "multi_select", access = JsonProperty.Access.READ_ONLY)
    private Options[] options;

    /**
     * 获取时使用
     */
    @JsonProperty(value = "multi_select", access = JsonProperty.Access.WRITE_ONLY)
    private MultiSelect multiSelect;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public MultiSelectDatabaseProperties(Boolean initType) {
        if (initType) {
            type = MULTI_SELECT;
        }
    }

}
