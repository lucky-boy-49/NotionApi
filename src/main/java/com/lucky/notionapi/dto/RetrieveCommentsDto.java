package com.lucky.notionapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.comment.Comment;
import jakarta.validation.Valid;
import lombok.Data;

/**
 * 检索评论DTO
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RetrieveCommentsDto {

    private String object;

    @Valid
    private Comment[] results;

    @JsonProperty("next_cursor")
    private String nextCursor;

    @JsonProperty("has_more")
    private Boolean hasMore;

    private String type;

    @JsonProperty("page_or_database")
    private Comment comment;

}
