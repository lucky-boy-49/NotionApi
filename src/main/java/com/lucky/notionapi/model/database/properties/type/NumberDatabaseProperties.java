package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.NumberFormat;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 数字
 * 数字数据库属性在 Notion UI 中呈现为包含数值的列。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberDatabaseProperties extends AbstractDatabaseProperties {


    /**
     * 数字格式
     */
    private NumberFormat number;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public NumberDatabaseProperties(Boolean initType) {
        if (initType) {
            type = NUMBER;
        }
    }

}
