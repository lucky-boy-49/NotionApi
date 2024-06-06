package com.lucky.notionapi.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.parent.Parent;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 创建评论DAO<br>
 * 通过公共 API 可以在两个位置添加新评论：1. 页面 2. 现有评论
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateCommentDao {

    /**
     * 页面父节点。必须有该父页或讨论 ID（不能两者兼有）
     */
    private Parent parent;

    /**
     * 讨论的 UUID 标识符。必须使用该标识符或父对象（不能同时使用两者）
     */
    @JsonProperty("discussion_id")
    private String discussionId;

    @Valid
    @JsonProperty("rich_text")
    @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
    private RichTextType[] richText;

}
