package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractProperties;
import com.lucky.notionapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 由...创建
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CreatedByProperties extends AbstractProperties {

    /**
     * 包含有关创建页面的用户的信息的用户对象。
     * created_by 无法更新。
     */
    @JsonProperty("created_by")
    private User createdBy;

}
