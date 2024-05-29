package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.enumerate.ColorEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 多选属性值对象包含 multi_select 属性中的多选选项值数组。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiSelectPropertyDao extends AbstractPropertyItem {

    @JsonProperty("multi_select")
    private MultiSelect[] multiSelect;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class MultiSelect {

        /**
         * 选项的 ID。<br>
         * 更新多选属性时，可以使用 name 或 id 。
         */
        private String id;

        /**
         * 该选项在 Notion 中的名称。<br>
         * 如果多选数据库属性还没有该名称的选项，如果集成也有写入父数据库的权限，它将被添加到数据库模式中。<br>
         * 注意：逗号（","）不适用于选择值。
         */
        private String name;

        /**
         * 选项的颜色。
         *
         * @see ColorEnum
         */
        private String color;

    }

}
