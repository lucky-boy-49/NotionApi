package com.lucky.notionapi.dao;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.database.properties.DatabaseProperties;
import com.lucky.notionapi.utils.serializer.DatabasePropertiesDeserializer;
import com.lucky.notionapi.utils.serializer.DatabasePropertiesSerializer;
import lombok.Data;

import java.util.List;

/**
 * 更新数据库Dao
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateDatabaseDao {

    /**
     * 一个富文本对象数组，表示在 Notion UI 中显示的数据库标题。如果省略，则数据库标题保持不变。
     */
    private RichTextType title;

    /**
     * 一个富文本对象数组，表示在 Notion UI 中显示的数据库描述。如果省略，则数据库说明保持不变。
     */
    private RichTextType description;

    /**
     * 请求中要更改的数据库属性，采用 JSON 对象形式。如果是更新现有属性，则键为 Notion 中出现的属性名称
     * 或 ID，值为属性模式对象。如果添加新属性，则键为新数据库属性的名称，值为属性模式对象。<br>
     * 如果省略，则数据库属性保持不变。
     * <p>
     * 如果要删除属性，请将其键设置为要删除的属性的名称或 ID，并将其值设置为 null。
     * <p>
     * 如果要更改属性的名称，请将其键设置为要更改的属性的名称或 ID，并将其值设置为新属性名称。
     * <p>
     * 如果要更改属性的类型，请将其键设置为要更改的属性的名称或 ID，并将其值设置为新属性类型。
     * <p>
     * 如果要更改属性的选项，请将其键设置为要更改的属性的名称或 ID，并将其值设置为新属性选项。
     * <p>
     * 如果要更改属性的配置，请将其键设置为要更改的属性的名称或 ID，并将其值设置为新属性配置。
     * <p>
     * 如果要更改属性的公式，请将其键设置为要更改的属性的名称或 ID，并将其值设置为新属性公式。
     * <p>
     */
    @JsonSerialize(using = DatabasePropertiesSerializer.class)
    @JsonDeserialize(using = DatabasePropertiesDeserializer.class)
    private List<DatabaseProperties> properties;

}
