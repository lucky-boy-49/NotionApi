package com.lucky.notionapi.model.database;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.file.FileType;
import com.lucky.notionapi.model.parent.Parent;
import com.lucky.notionapi.model.user.User;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * 数据库对象在 Notion 中描述数据库的属性模式。页面是数据库中的项目（或子项）。页面属性值必须符合父数据库对象中布置的属性对象。
 *
 * @author jiahe
 */
@Data
public class Database {

    /**
     * 始终为"database"
     */
    private String object;

    /**
     * 数据库的唯一标识符。
     */
    private String id;

    /**
     * 创建此数据库的日期和时间。格式为 ISO 8601 日期时间字符串。
     */
    @JsonProperty("created_time")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime createdTime;

    /**
     * 创建数据库的用户。
     */
    @JsonProperty("created_by")
    private User createdBy;

    /**
     * 该数据库更新的日期和时间。格式为 ISO 8601 日期时间字符串。
     */
    @JsonProperty("last_edited_time")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
    private LocalDateTime lastEditedTime;

    /**
     * 最后编辑数据库的用户。
     */
    @JsonProperty("last_edited_by")
    private User lastEditedBy;

    /**
     * Notion 中显示的数据库名称。
     */
    private RichTextType[] title;

    /**
     * Notion 中出现的数据库描述。
     */
    private RichTextType[] description;

    /**
     * 页面图标。
     */
    private FileType icon;

    /**
     * 页面封面图片。
     */
    private FileType cover;

    /**
     * 数据库父级的信息。
     */
    private Parent parent;

    /**
     * Notion 数据库的 URL。
     */
    private String url;

    /**
     * 数据库是否被删除。
     */
    @JsonProperty("in_trash")
    private Boolean isTrash;

    /**
     * 如果数据库作为内联块出现在页面中，则具有值 true 。否则，如果数据库显示为子页面，则值为 false 。
     */
    @JsonProperty("is_inline")
    private Boolean isInline;

    /**
     * 公共页面 URL（如果页面已发布到网络）。否则， null 。
     */
    @JsonProperty("public_url")
    private String publicUrl;

}
