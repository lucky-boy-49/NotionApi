package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import com.lucky.notionapi.model.file.FileType;
import jakarta.validation.Valid;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 文件数据库属性在 Notion UI 中呈现为一列，其值可以是直接上传到 Notion 的文件，也可以是文件的外部链接。 files 类型对象为空；没有额外的配置。<br>
 * Notion API尚不支持将文件上传到Notion。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilesDatabaseProperties extends AbstractDatabaseProperties {

    @Valid
    private FileType files;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public FilesDatabaseProperties(Boolean initType) {
        if (initType) {
            type = FILES;
        }
    }

}
