package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 书签块
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BookmarkBlock extends AbstractBlock {

    /**
     * 书签对象
     */
    @Valid
    private Bookmark bookmark;

    /**
     * 构造函数，创建给{@link #type}赋值的对象
     */
    public BookmarkBlock() {
        type = BOOKMARK;
    }

    /**
     * 书签对象
     */
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Bookmark {

        /**
         * 富文本对象数组
         */
        @Valid
        @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
        private RichTextType[] caption;

        /**
         * 书签的链接
         */
        @Size(max = NotionConfig.ANY_URL_SIZE, message = NotionConfig.ANY_URL_MESSAGE)
        private String url;

    }

}
