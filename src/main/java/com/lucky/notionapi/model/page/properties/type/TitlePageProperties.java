package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 标题<br>
 * 检索页面端点最多返回 title 属性的 25 个内联页面或人员引用。如果 title 属性包含超过 25 个引用，<br>
 * 则您可以使用特定 title 属性的检索页面属性项端点来获取其完整的引用列表。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TitlePageProperties extends AbstractPageProperties {

    /**
     * 富文本对象的数组。
     */
    private RichTextType[] title;

    public TitlePageProperties() {
        type = TITLE;
    }

}
