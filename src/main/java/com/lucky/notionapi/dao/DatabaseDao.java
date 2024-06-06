package com.lucky.notionapi.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.database.properties.DatabaseProperties;
import com.lucky.notionapi.model.file.FileType;
import com.lucky.notionapi.model.parent.Parent;
import com.lucky.notionapi.utils.serializer.DatabasePropertiesSchemaSerializer;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

/**
 * 数据库对象Dao<br>
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatabaseDao {

    /**
     * 父对象
     */
    private Parent parent;

    /**
     * Notion 中出现的数据库标题。富文本对象数组。
     */
    @Valid
    @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
    private RichTextType[] title;

    /**
     * 图标
     */
    @Valid
    private FileType icon;

    /**
     * 背景
     */
    @Valid
    private FileType cover;

    /**
     * 数据库的属性模式。键是 Notion 中出现的属性名称，值是属性模式对象。
     */
    @Valid
    @JsonSerialize(using = DatabasePropertiesSchemaSerializer.class)
    private List<DatabaseProperties> properties;

}
