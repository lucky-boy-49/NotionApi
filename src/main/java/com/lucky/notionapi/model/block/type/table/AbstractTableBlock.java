package com.lucky.notionapi.model.block.type.table;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.block.AbstractBlock;

/**
 * 表格抽象
 *
 * @author 贺佳
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = TableBlock.class, name = "table"),
        @JsonSubTypes.Type(value = TableRowsBlock.class, name = "table_row"),
})
public abstract class AbstractTableBlock extends AbstractBlock {
}
