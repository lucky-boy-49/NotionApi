package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.Color;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 多选
 * 多选数据库属性在 Notion UI 中呈现为包含一系列选项中的值的列。每一行可以包含一个或多个选项。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
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

    @Data
    static class MultiSelect {

        private Options[] options;

    }

    @Data
    static class Options {

        /**
         * 选项的颜色。
         *
         * @see Color
         */
        private String color;

        /**
         * 选项的 ID。
         * 您可以使用 id 或 name 更新多选属性。
         */
        private String id;

        /**
         * 选项的名称出现在 Notion 中。
         * 如果多选数据库属性尚无该名称的选项，并且集成还具有对父数据库的写访问权限，则该名称将添加到数据库架构中。
         * 注意：逗号 ( "," ) 对于选择值无效。
         */
        private String name;

    }

}
