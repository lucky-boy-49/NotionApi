package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 最后编辑时间
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LastEditedTimePageProperties extends AbstractPageProperties {

    /**
     * 页面上次编辑的日期和时间。
     * 无法更新。
     */
    @JsonProperty("last_edited_time")
    private String lastEditedTime;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public LastEditedTimePageProperties(Boolean initType) {
        if (initType) {
            type = LAST_EDITED_TIME;
        }
    }

}
