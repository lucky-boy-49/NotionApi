package com.lucky.notionapi.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lucky.notionapi.model.PageOrDatabase;
import lombok.Data;

/**
 * 搜索DTO
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchDto {

    private String object;

    private PageOrDatabase[] results;

    @JsonProperty("next_cursor")
    private String nextCursor;

    @JsonProperty("has_more")
    private Boolean hasMore;

    private String type;

    @JsonProperty("page_or_database")
    private ObjectNode pageOrDatabase;

}
