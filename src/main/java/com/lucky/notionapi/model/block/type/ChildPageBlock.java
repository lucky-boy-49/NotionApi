package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.block.AbstractBlock;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 子页面
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChildPageBlock extends AbstractBlock {

    /**
     * 要创建或更新 child_page 类型块，请使用创建页面和更新页面端点，
     * 并在 parent 正文参数中指定父页面的 ID。
     */
    @JsonProperty("child_page")
    private ChildPage childPage;

    public ChildPageBlock() {
        type = CHILD_PAGE;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class ChildPage {

        /**
         * 页面的纯文本 title 。
         */
        private String title;

    }

}
