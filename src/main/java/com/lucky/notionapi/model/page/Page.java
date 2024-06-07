package com.lucky.notionapi.model.page;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lucky.notionapi.model.PageOrDatabase;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.file.ExternalFile;
import com.lucky.notionapi.model.file.FileType;
import com.lucky.notionapi.model.page.properties.PageProperties;
import com.lucky.notionapi.model.parent.Parent;
import com.lucky.notionapi.model.user.User;
import com.lucky.notionapi.util.serializer.PagePropertiesDeserializer;
import com.lucky.notionapi.util.serializer.PagePropertiesSerializer;
import lombok.Data;

import java.util.List;

/**
 * 所有页面都有一个父页面。如果父级是数据库，则属性值符合数据库属性的架构。否则，唯一的属性值是 title 。
 * 页面内容以块的形式提供。可以使用检索子级块读取内容并使用附加块子级附加内容。
 * 可以继承此类，已满足实际需求
 * @author 贺佳
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Page implements PageOrDatabase {

    /**
     * 始终 "page" 。
     */
    private String object;

    /**
     * 页面的唯一标识符。
     */
    private String id;

    /**
     * 创建此页面的日期和时间。格式为 ISO 8601 日期时间字符串。
     */
    @JsonProperty("created_time")
    private String createdTime;

    /**
     * 创建该页面的用户。
     */
    @JsonProperty("created_by")
    private User createdBy;

    /**
     * 此页面更新的日期和时间。格式为 ISO 8601 日期时间字符串。
     */
    @JsonProperty("last_edited_time")
    private String lastEditedTime;

    /**
     * 最后编辑页面的用户。
     */
    @JsonProperty("last_edited_by")
    private User lastEditedBy;

    /**
     * 页面是否归档
     */
    private Boolean archived;

    /**
     * 页面是否被删除。
     */
    @JsonProperty("in_trash")
    private Boolean inTrash;

    /**
     * 文件对象（目前仅支持 "external" 中的 type ）或Emoji对象
     */
    private FileType icon;

    /**
     * 文件对象（目前仅支持 "external" 中的 type ）
     */
    private ExternalFile cover;

    /**
     * 页属性
     * 由于属性是动态的，所以只能手动读取和写入
     * @link <a href="https://developers.notion.com/reference/page#page-properties">Notion页面属性</a>
     */
    @JsonSerialize(using = PagePropertiesSerializer.class)
    @JsonDeserialize(using = PagePropertiesDeserializer.class)
    private List<PageProperties> properties;

    /**
     * 父级的信息。
     */
    private Parent parent;

    /**
     * Notion 页面的 URL。
     */
    private String url;

    /**
     * 公共页面 URL（如果页面已发布到网络）。否则， null 。
     */
    @JsonProperty("public_url")
    private String publicUrl;

    /**
     * 页面孩子
     */
    private BlockType[] children;

}
