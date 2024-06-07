package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.model.communal.Color;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 选择属性值对象
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SelectPropertyDao extends AbstractPropertyItem {

    private Select select;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Select {

        /**
         * 选项的 ID。<br>
         * 更新选择属性时，可以使用 name 或 id 。
         */
        private String id;

        /**
         * 该选项在 Notion 中的名称。<br>
         * 如果选择数据库属性还没有该名称的选项，如果集成也有写入父数据库的权限，它将被添加到数据库模式中。<br>
         * 注意：逗号（","）不适用于选择值。
         */
        private String name;

        /**
         * 选项的颜色。
         *
         * @see Color
         */
        private String color;

    }

}
