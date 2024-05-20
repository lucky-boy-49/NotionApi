package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.enumerate.Color;
import com.lucky.notionapi.model.block.AbstractBlock;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 目录
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TableOfContentsBlock extends AbstractBlock {

    @JsonProperty("table_of_contents")
    private TableOfContents tableOfContents;

    public TableOfContentsBlock() {
        tableOfContents = new TableOfContents();
        type = TABLE_OF_CONTENTS;
    }

    @Data
    static class TableOfContents {

        /**
         * 块的颜色。
         *
         * @see Color
         */
        private String color;

    }

}
