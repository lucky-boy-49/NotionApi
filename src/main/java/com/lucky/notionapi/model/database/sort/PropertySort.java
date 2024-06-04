package com.lucky.notionapi.model.database.sort;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 属性值排序<br>
 * 该排序按特定属性对数据库查询进行排序。
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PropertySort implements DatabaseSort {

    /**
     * 要排序的属性名称。
     */
    private String property;

    /**
     * 排序方向。可能的值包括 "ascending" 和 "descending" 。
     */
    private String direction;

}
