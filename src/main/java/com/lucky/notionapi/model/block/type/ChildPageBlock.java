package com.lucky.notionapi.model.block.type;

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
public class ChildPageBlock extends AbstractBlock {

    /**
     * 要创建或更新 child_page 类型块，请使用创建页面和更新页面端点，
     * 并在 parent 正文参数中指定父页面的 ID。
     */
    private ChildPage childPage;

    public ChildPageBlock() {
        this.childPage = new ChildPage();
    }

    @Data
    static class ChildPage {

        /**
         * 页面的纯文本 title 。
         */
        private String title;

    }

}
