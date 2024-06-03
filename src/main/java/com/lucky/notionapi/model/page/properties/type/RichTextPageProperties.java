package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 富文本<br>
 * 检索页面端点最多返回 rich_text 属性的 25 个填充的内联页面或人员引用。如果 rich_text 属性包含超过 25 个引用，<br>
 * 则您可以使用特定 rich_text 属性的检索页面属性项端点来获取其完整的引用列表。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RichTextPageProperties extends AbstractPageProperties {

    /**
     * 富文本对象数组
     */
    @JsonProperty("rich_text")
    private RichTextType[] richText;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public RichTextPageProperties(Boolean initType) {
        if (initType) {
            type = RICH_TEXT;
        }
    }

}
