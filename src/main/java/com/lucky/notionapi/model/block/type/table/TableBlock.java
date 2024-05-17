package com.lucky.notionapi.model.block.type.table;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 表格
 * 表块对象是表行子对象的父块。
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TableBlock extends AbstractTableBlock {

    public TableBlock() {
        this.table = new Table();
    }

    private Table table;

    @Data
    static class Table {

        /**
         * 表中的列数。
         * 请注意，一旦创建表，就无法通过公共 API 更改此设置。
         * table_width 只能在第一次创建表时设置。
         * 请注意，表中的列数只能在首次创建表时设置。调用更新块端点来更新 table_width 失败。
         */
        private Integer tableWidth;

        /**
         * 表格是否有列标题。如果 true ，则表中的第一行在视觉上与其他行不同。
         */
        @JsonProperty("has_column_header")
        private Boolean hasColumnHeader;

        /**
         * 表格是否有标题行。如果 true ，则表中的第一列在视觉上与其他列不同。
         */
        @JsonProperty("has_row_header")
        private Boolean hasRowHeader;

    }

}
