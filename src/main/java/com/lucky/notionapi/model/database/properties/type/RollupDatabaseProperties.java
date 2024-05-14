package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 汇总<br>
 * 汇总数据库属性在 Notion UI 中呈现为一列，其中包含汇总值、从相关数据库中提取的特定属性。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RollupDatabaseProperties extends AbstractDatabaseProperties {

    private Rollup rollup;

    @Data
    static class Rollup {

        /**
         * 从相关页面计算汇总值的函数。
         */
        private String function;

        /**
         * 汇总的相关数据库属性的id 。
         */
        @JsonProperty("relation_property_id")
        private String relationPropertyId;

        /**
         * 汇总的相关数据库属性的 name 。
         */
        @JsonProperty("relation_property_name")
        private String relationPropertyName;

        /**
         * 汇总属性的 id 。
         */
        @JsonProperty("rollup_property_id")
        private String rollupPropertyId;

        /**
         * 汇总属性的 name 。
         */
        @JsonProperty("rollup_property_name")
        private String rollupPropertyName;

    }

}
