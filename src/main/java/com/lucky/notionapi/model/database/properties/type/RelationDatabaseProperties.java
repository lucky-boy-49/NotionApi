package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 关系<br>
 * 关系数据库属性在 Notion UI 中呈现为包含关系、对另一个数据库中页面的引用（作为值）的列。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelationDatabaseProperties extends AbstractDatabaseProperties {

    /**
     * 相关页面引用的数组。页面引用是一个具有 id 键和与另一个数据库中的页面 ID 相对应的字符串值的对象。
     */
    private Relation relation;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Relation {

        /**
         * 关系属性引用的数据库。
         */
        @JsonProperty("database_id")
        private String databaseId;

        /**
         * 当该属性更改时，相关数据库中相应属性的 name 也会更新。
         */
        @JsonProperty("synced_property_name")
        private String syncedPropertyName;

        /**
         * 当该属性更改时，相关数据库中相应属性的 id 也会更新。
         */
        @JsonProperty("synced_property_id")
        private String syncedPropertyId;

    }

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public RelationDatabaseProperties(Boolean initType) {
        if (initType) {
            type = PHONE_NUMBER;
        }
    }

}
