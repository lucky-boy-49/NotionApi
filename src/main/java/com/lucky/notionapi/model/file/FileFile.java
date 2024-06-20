package com.lucky.notionapi.model.file;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 文件对象包含有关上传到 Notion 的文件的数据，或有关链接到 Notion 的外部文件的数据。
 * @author 贺佳
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileFile extends AbstractFile {

    /**
     * 包含特定于类型的配置的对象。对于外部文件，对于 Notion 托管的文件，对象的键是 file 。
     */
    @Valid
    private File file;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class File {

        /**
         * 经过验证的文件 S3 URL。
         */
        @Size(max = NotionConfig.ANY_URL_SIZE, message = NotionConfig.ANY_URL_MESSAGE)
        private String url;

        /**
         * 链接过期的日期和时间，格式为 ISO 8601 日期时间字符串。
         */
        @JsonProperty("expiry_time")
        private String expiryTime;

    }

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public FileFile(Boolean initType) {
        if (initType) {
            type = FILE;
        }
    }

}
