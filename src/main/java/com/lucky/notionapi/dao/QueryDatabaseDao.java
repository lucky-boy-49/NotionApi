package com.lucky.notionapi.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.database.filter.DatabaseFilter;
import com.lucky.notionapi.model.database.sort.DatabaseSort;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 数据库查询条件对象
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryDatabaseDao {

    /**
     * 提供时，根据筛选条件限制返回的页面。
     */
    private DatabaseFilter filter;

    /**
     * 提供时，根据提供的排序条件对结果进行排序。
     */
    @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
    private DatabaseSort[] sorts;

    /**
     * 提供时，返回从所提供的游标之后开始的结果页。如果不提供，该端点将返回第一页结果。
     */
    @JsonProperty("start_cursor")
    private String startCursor;

    /**
     * 回复中希望从完整列表中获取的项目数。最大值：100
     */
    @JsonProperty("page_size")
    private Integer pageSize;

}
