package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractProperties;
import com.lucky.notionapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 最后编辑者
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LastEditedByProperties extends AbstractProperties {

    /**
     * 包含有关上次更新页面的用户的信息的用户对象。
     * 无法更新。
     */
    @JsonProperty("last_edited_by")
    private User lastEditedBy;

}
