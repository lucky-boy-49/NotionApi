package com.lucky.notionapi.model.block.richtext.type.mention;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 页面提及类型对象
 * 页面提及在相应的 page 字段中包含页面引用。页面引用是一个具有 id 属性和与页面 ID 对应的字符串值 (UUIDv4) 的对象。
 * 如果集成无权访问提及的页面，则仅返回提及的 ID。作为标题的 plain_text 值显示为 "Untitled" ，注释对象的值是默认值。
 * @author jiahe
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageMention implements Mention {

    private String type;

    private Page page;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public PageMention(Boolean initType) {
        if (initType) {
            type = PAGE;
        }
    }

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Page {

        private String id;

    }

}
