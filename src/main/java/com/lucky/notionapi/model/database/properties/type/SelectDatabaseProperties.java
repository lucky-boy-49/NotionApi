package com.lucky.notionapi.model.database.properties.type;

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
public class SelectDatabaseProperties extends AbstractDatabaseProperties {

    private Select select;

    @Data
    static class Select {

        private Options[] options;

    }

    @Data
    static class Options {

        /**
         * Notion UI 中呈现的选项颜色。可能的值包括
         */
        private String color;

        /**
         * 选项的标识符。即使名称改变，它也不会改变。这些有时（但并非总是）是 UUID。
         */
        private String id;

        /**
         * 选项的名称出现在 Notion UI 中。
         */
        private String name;

    }

}
