package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.block.AbstractBlock;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 链接预览
 * link_preview 块只能作为响应的一部分返回。 API 不支持创建或附加 link_preview 块。
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LinkPreviewBlock extends AbstractBlock {


    @JsonProperty("link_preview")
    private LinkPreview linkPreview;

    @Data
    static class LinkPreview {

        private String url;

    }

}
