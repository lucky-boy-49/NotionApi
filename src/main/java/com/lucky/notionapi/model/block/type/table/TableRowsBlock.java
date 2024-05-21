package com.lucky.notionapi.model.block.type.table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 表格行数
 * 请按照以下步骤获取 table 的 table_row ：
 * 1.从查询中获取 table ID 以检索父页面的块子级。
 * 2.从查询中获取 table_rows 以检索 table 的块子级。
 * 通过 Append 块子端点创建表块时， table 必须至少有一个 table_row ，其 cells 数组的长度与 table_width 。
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableRowsBlock extends AbstractTableBlock {

    public TableRowsBlock() {
        type = TABLE_ROW;
    }

    @JsonProperty("table_row")
    private TableRow tableRow;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TableRow {

        private RichTextType[] cells;

    }

}
