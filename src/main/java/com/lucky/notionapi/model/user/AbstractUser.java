package com.lucky.notionapi.model.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 所有用户都包含的字段
 * @author jiahe
 */
@Data
public abstract class AbstractUser implements User {

    private String object;

    private String id;

    private String type;

    private String name;

    @JsonProperty("avatar_url")
    private String avatarUrl;

}
