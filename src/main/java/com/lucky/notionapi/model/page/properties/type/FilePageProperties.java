package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.file.FileType;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 文件
 * 尽管 Notion 不支持通过 API 上传文件，但如果您传递包含 Notion 托管的文件的 file 对象，它仍然是文件之一。
 * 要删除任何文件，只需不要在更新响应中传递它即可。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilePageProperties extends AbstractPageProperties {

    /**
     * 包含有关文件信息的对象数组。
     */
    @Valid
    @Size(max = NotionConfig.BLOCK_ARRAY_SIZE, message = NotionConfig.BLOCK_ARRAY_MESSAGE)
    private FileType[] files;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public FilePageProperties(Boolean initType) {
        if (initType) {
            type = FILES;
        }
    }

}
