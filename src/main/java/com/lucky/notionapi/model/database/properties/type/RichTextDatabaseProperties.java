package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 富文本<br>
 * 富文本数据库属性在 Notion UI 中呈现为包含文本值的列。 rich_text 类型对象为空；没有额外的配置。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RichTextDatabaseProperties extends AbstractDatabaseProperties {

    /**
     * 富文本对象数组
     */
    @JsonProperty("rich_text")
    private RichTextType[] richText;

}
