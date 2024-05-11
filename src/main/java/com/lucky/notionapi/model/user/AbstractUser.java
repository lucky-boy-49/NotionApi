package com.lucky.notionapi.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 所有用户都包含的字段
 * @author jiahe
 */
public abstract class AbstractUser implements User {

    public final String object = "user";

    public String id;

    public String type;

    public String name;

    @JsonProperty("avatar_url")
    public String avatarUrl;

}
