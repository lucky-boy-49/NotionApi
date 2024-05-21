package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.block.AbstractBlock;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 列,它们在 column 属性中不包含任何信息。它们只能附加到 column_list 上。
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColumnBlock extends AbstractBlock {

    private Column column;

    public ColumnBlock() {
        type = COLUMN;
    }
    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Column {

    }

}
