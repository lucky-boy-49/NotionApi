package com.lucky.notionapi.model.page.properties.type;

import com.lucky.notionapi.model.file.FileType;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件
 * 尽管 Notion 不支持通过 API 上传文件，但如果您传递包含 Notion 托管的文件的 file 对象，它仍然是文件之一。
 * 要删除任何文件，只需不要在更新响应中传递它即可。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class FilePageProperties extends AbstractPageProperties {

    /**
     * 包含有关文件信息的对象数组。
     */
    private FileType[] files;

}
