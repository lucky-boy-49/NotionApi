package com.lucky.notionapi.model.block.type;

import com.lucky.notionapi.model.block.AbstractBlock;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 嵌入
 * Notion 应用程序和 API 之间嵌入块的差异:
 * Notion 应用程序使用第 3 方服务 iFramely 来验证和请求给定 URL 的嵌入元数据。
 * 这在 Web 应用程序中效果很好，因为 Notion 可以启动对 URL 信息的异步请求，
 * 这可能需要几秒钟或更长时间才能完成，然后在收到 iFramely 的响应后使用 UI 中的元数据
 * 更新块。我们选择在 API 中创建嵌入块时不调用 iFramely，因为 API 需要能够比 UI 更快地返回，
 * 而且 iFramely 的响应实际上可能会导致我们更改块类型。这将导致缓慢且可能令人困惑的体验，
 * 因为响应中的块与请求中发送的块不匹配。结果是，通过 API 创建的嵌入块可能看起来与在 Notion
 * 应用程序中创建的对应块不完全相同。
 * Vimeo 视频链接可以使用嵌入块类型通过公共 API 嵌入到 Notion 页面中。
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class EmbedBlock extends AbstractBlock {

    private Embed embed;

    @Data
    static class Embed {

        /**
         * 嵌入块显示的网站链接。
         */
        private String url;

    }

}
