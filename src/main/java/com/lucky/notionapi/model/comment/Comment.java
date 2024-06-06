package com.lucky.notionapi.model.comment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.parent.Parent;
import com.lucky.notionapi.model.user.User;
import jakarta.validation.constraints.Size;
import lombok.Data;

/**
 * 评论·对象表示 Notion 页面或块上的注释。可以通过有权访问页面/块和正确功能的集成来查看或创建评论。<br>
 * 检索评论时，将以数组的形式返回一个或多个 Comment 对象，并按时间升序排序。当向页面或讨论添加评论时，将始终返回刚刚添加的 Comment 对象。
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Comment {

    private String object;

    private String id;

    private Parent parent;

    @JsonProperty("discussion_id")
    private String discussionId;

    @JsonProperty("created_time")
    private String createdTime;

    @JsonProperty("last_edited_time")
    private String lastEditedTime;

    @JsonProperty("created_by")
    private User createdBy;

    @JsonProperty("rich_text")
    @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
    private RichTextType[] richText;

}
