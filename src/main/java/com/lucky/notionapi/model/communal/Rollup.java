package com.lucky.notionapi.model.communal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 汇总
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rollup {

    /**
     * 从相关页面计算汇总值的函数。可能的值包括 count_all , count_values , count_unique_values , count_empty , count_not_empty , percent_empty , percent_not_empty , sum , average , median , min , max , range , show_original
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
