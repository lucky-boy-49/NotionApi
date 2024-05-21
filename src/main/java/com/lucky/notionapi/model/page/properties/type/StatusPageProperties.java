package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.enumerate.Color;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 选择<br>
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusPageProperties extends AbstractPageProperties {

    private Status status;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Status {

        /**
         * 选项的颜色。
         *
         * @see Color
         */
        private String color;

        /**
         * 选项的 ID。<br>
         * 您可以使用 id 或 name 更新选择的属性。
         */
        private String id;

        /**
         * 出现在 Notion 中选项的名称<br>
         * 如果选择数据库属性尚无该名称的选项，并且集成还具有对父数据库的写入访问权限，则该名称将添加到数据库架构中。
         */
        private String name;

    }

}
