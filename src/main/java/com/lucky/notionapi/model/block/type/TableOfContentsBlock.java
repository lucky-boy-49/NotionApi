package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TableOfContentsBlock extends AbstractBlock {

    @JsonProperty("table_of_contents")
    private TableOfContents tableOfContents;

    public TableOfContentsBlock() {
        type = TABLE_OF_CONTENTS;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class TableOfContents {

        /**
         * 块的颜色。
         *
         * @see Color
         */
        private String color;

    }

}
