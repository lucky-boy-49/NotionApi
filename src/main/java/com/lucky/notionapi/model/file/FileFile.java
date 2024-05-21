package com.lucky.notionapi.model.file;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件对象包含有关上传到 Notion 的文件的数据，或有关链接到 Notion 的外部文件的数据。
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileFile extends AbstractFile {

    /**
     * 包含特定于类型的配置的对象。对于外部文件，对于 Notion 托管的文件，对象的键是 file 。
     */
    private File file;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class File {

        private String url;

        @JsonProperty("expiry_time")
        private String expiryTime;

    }

}
