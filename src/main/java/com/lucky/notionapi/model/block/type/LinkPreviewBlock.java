package com.lucky.notionapi.model.block.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.block.AbstractBlock;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkPreviewBlock extends AbstractBlock {

    @Valid
    @JsonProperty("link_preview")
    private LinkPreview linkPreview;

    public LinkPreviewBlock() {
        type = LINK_PREVIEW;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class LinkPreview {

        @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
        private String url;

    }

}
