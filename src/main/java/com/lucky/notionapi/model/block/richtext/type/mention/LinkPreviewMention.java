package com.lucky.notionapi.model.block.richtext.type.mention;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 链接预览提及类型对象
 * 如果用户选择将链接预览共享为提及，则 API 会将链接预览提及作为 type 值为 link_preview 的富文本对象进行处理。链接预览富文本提及包含相应的
 * link_preview 对象，该对象包含用于创建链接预览提及的 url 。
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LinkPreviewMention implements Mention {

    private String type;

    private LinkPreview linkPreview;

    public LinkPreviewMention() {
        type = LINK_PREVIEW;
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class LinkPreview {

        private String url;

    }

}
