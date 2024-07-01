package com.lucky.notionapi.model.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 所有用户都包含的字段
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractUser implements User {

    /**
     * 始终为“user”
     */
    protected String object;

    /**
     * 该用户的唯一标识符。
     */
    protected String id;

    /**
     * 用户的类型。可能的值为 "person" 和 "bot" 。
     */
    protected String type;

    /**
     * 用户名
     */
    protected String name;

    /**
     * 选择的头像图像。
     */
    @JsonProperty("avatar_url")
    protected String avatarUrl;

}
