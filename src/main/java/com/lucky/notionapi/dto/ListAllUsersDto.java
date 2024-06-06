package com.lucky.notionapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.user.User;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 列出所有用户DTO
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListAllUsersDto {

    private String object;

    @Size(max = NotionConfig.ANY_PEOPLE_SIZE, message = NotionConfig.ANY_PEOPLE_MESSAGE)
    private User[] results;

    @JsonProperty("next_cursor")
    private String nextCursor;

    @JsonProperty("has_more")
    private Boolean hasMore;

    private String type;

    private User user;

}
