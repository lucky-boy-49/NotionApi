package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.Color;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 多选
 * 如果您想通过更新页面或更新数据库端点向多选属性添加新选项，则您的集成需要对父数据库的写入访问权限。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiSelectPageProperties extends AbstractPageProperties {

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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class MultiSelect {

        private Options[] options;

    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Options {

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
