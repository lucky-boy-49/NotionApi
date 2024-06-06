package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 富文本<br>
 * 富文本数据库属性在 Notion UI 中呈现为包含文本值的列。 rich_text 类型对象为空；没有额外的配置。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RichTextDatabaseProperties extends AbstractDatabaseProperties {

    /**
     * 富文本对象数组
     */
    @Valid
    @JsonProperty("rich_text")
    private RichTextType richText;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public RichTextDatabaseProperties(Boolean initType) {
        if (initType) {
            type = PHONE_NUMBER;
        }
    }

}
