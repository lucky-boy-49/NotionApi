package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.block.AbstractBlock;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
    private Bookmark bookmark;

    public BookmarkBlock() {
        type = BOOKMARK;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Bookmark {

        /**
         * 富文本对象数组
         */
        private RichTextType[] caption;

        /**
         * 书签的链接
         */
        private String url;

    }

}
