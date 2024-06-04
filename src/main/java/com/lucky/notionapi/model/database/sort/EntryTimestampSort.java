package com.lucky.notionapi.model.database.sort;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 条目时间戳排序<br>
 * 该排序按与数据库条目相关的时间戳对数据库查询进行排序。
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EntryTimestampSort implements DatabaseSort {

    /**
     * 要排序的时间戳名称。可能的值包括 "created_time" 和 "last_edited_time" 。
     */
    private String timestamp;

    /**
     * 排序方向。可能的值包括 "ascending" 和 "descending" 。
     */
    private String direction;

}
