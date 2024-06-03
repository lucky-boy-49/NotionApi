package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import com.lucky.notionapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 最后编辑者
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LastEditedByPageProperties extends AbstractPageProperties {

    /**
     * 包含有关上次更新页面的用户的信息的用户对象。
     * 无法更新。
     */
    @JsonProperty("last_edited_by")
    private User lastEditedBy;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public LastEditedByPageProperties(Boolean initType) {
        if (initType) {
            type = LAST_EDITED_BY;
        }
    }

}
