package com.lucky.notionapi.model.database.properties.type;

import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 公式数据库属性在 Notion UI 中呈现为包含从提供的表达式派生的值的列。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FormulaDatabaseProperties extends AbstractDatabaseProperties {

    private Formula formula;

    @Data
    static class Formula {

        /**
         * 用于计算该属性值的公式。
         */
        private String expression;

    }

}
