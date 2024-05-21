package com.lucky.notionapi.model.comment;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.parent.Parent;
import com.lucky.notionapi.model.user.User;
import lombok.Data;

import java.time.LocalDateTime;

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
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime createdTime;

    @JsonProperty("last_edited_time")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime lastEditedTime;

    @JsonProperty("created_by")
    private User createdBy;

    @JsonProperty("rich_text")
    private RichTextType[] richText;

}
