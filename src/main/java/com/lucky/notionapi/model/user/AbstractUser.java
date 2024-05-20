package com.lucky.notionapi.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 所有用户都包含的字段
 * @author jiahe
 */
@Data
public abstract class AbstractUser implements User {

    protected String object;

    protected String id;

    protected String type;

    protected String name;

    @JsonProperty("avatar_url")
    protected String avatarUrl;

}
