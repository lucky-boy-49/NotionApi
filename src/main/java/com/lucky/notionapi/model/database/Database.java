package com.lucky.notionapi.model.database;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.PageOrDatabase;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.database.properties.DatabaseProperties;
import com.lucky.notionapi.model.file.FileType;
import com.lucky.notionapi.model.parent.Parent;
import com.lucky.notionapi.model.user.User;
import com.lucky.notionapi.util.serializer.DatabasePropertiesDeserializer;
import com.lucky.notionapi.util.serializer.DatabasePropertiesSerializer;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

/**
 * 数据库对象在 Notion 中描述数据库的属性模式。页面是数据库中的项目（或子项）。页面属性值必须符合父数据库对象中布置的属性对象。
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Database implements PageOrDatabase {

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
    private String createdTime;

    /**
     * 创建数据库的用户。
     */
    @JsonProperty("created_by")
    private User createdBy;

    /**
     * 该数据库更新的日期和时间。格式为 ISO 8601 日期时间字符串。
     */
    @JsonProperty("last_edited_time")
    private String lastEditedTime;

    /**
     * 最后编辑数据库的用户。
     */
    @JsonProperty("last_edited_by")
    private User lastEditedBy;

    /**
     * Notion 中显示的数据库名称。
     */
    @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
    private RichTextType[] title;

    /**
     * Notion 中出现的数据库描述。
     */
    @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
    private RichTextType[] description;

    /**
     * 页面图标。
     */
    @Valid
    private FileType icon;

    /**
     * 页面封面图片。
     */
    @Valid
    private FileType cover;

    /**
     * Notion中出现的数据库属性的架构。
     */
    @JsonSerialize(using = DatabasePropertiesSerializer.class)
    @JsonDeserialize(using = DatabasePropertiesDeserializer.class)
    private List<DatabaseProperties> properties;

    /**
     * 数据库父级的信息。
     */
    private Parent parent;

    /**
     * Notion 数据库的 URL。
     */
    @Size(max = NotionConfig.ANY_URL_SIZE, message = NotionConfig.ANY_URL_MESSAGE)
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
    @Size(max = NotionConfig.ANY_URL_SIZE, message = NotionConfig.ANY_URL_MESSAGE)
    private String publicUrl;

}
