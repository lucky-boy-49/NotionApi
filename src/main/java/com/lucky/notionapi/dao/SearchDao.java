package com.lucky.notionapi.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.database.sort.EntryTimestampSort;
import lombok.Data;

/**
 * 搜索DAO
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchDao {

    /**
     * API 与页面和数据库标题进行比较的文本。
     */
    private String query;

    /**
     * 一组标准，即 direction 和 timestamp 键，用于对结果进行排序。唯一支持的时间戳值是 "last_edited_time" 。支持的 direction 值是
     * "ascending" 和 "descending" 。如果不提供 sort ，则首先返回最近编辑的结果。
     */
    private EntryTimestampSort sort;

    private Filter filter;

    /**
     * 在以前的响应中返回的 cursor 值，如果提供，则将响应限制为 cursor 之后开始的结果。如果不提供，则返回第一页结果。
     */
    @JsonProperty("start_cursor")
    private String startCursor;

    /**
     * 要包含在回复中的完整列表中的项目数。最大值： 100 。
     */
    @JsonProperty("page_size")
    private Integer pageSize;

    /**
     * 一组标准，即 value 和 property 键，可将结果限制为仅限页面或仅限数据库。
     * 可能的 value 值是 "page" 或 "database" 。唯一支持的 property 值是 "object" 。
     */
    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Filter {

        /**
         * 要过滤结果的属性值。对象类型的可能值包括 page 或 database 。限制：目前唯一允许使用的过滤器是 object ，
         * 它将根据对象类型（ page 或 database ）进行过滤。
         */
        private String value;

        /**
         * 要过滤的属性名称。目前，唯一可以过滤的属性是对象类型。可能的值包括 object 。限制：目前唯一允许使用的过滤器是 object ，
         * 它将根据对象类型（ page 或 database ）进行筛选。
         */
        private String property;

    }

}
