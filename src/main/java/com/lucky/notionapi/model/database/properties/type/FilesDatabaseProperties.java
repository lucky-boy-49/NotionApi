package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import com.lucky.notionapi.model.file.FileType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件数据库属性在 Notion UI 中呈现为一列，其值可以是直接上传到 Notion 的文件，也可以是文件的外部链接。 files 类型对象为空；没有额外的配置。<br>
 * Notion API尚不支持将文件上传到Notion。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilesDatabaseProperties extends AbstractDatabaseProperties {

    private FileType files;

}
