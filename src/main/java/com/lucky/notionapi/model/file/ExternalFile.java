package com.lucky.notionapi.model.file;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 外部文件
 *
 * @author 贺佳
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExternalFile extends AbstractFile {

    /**
     * 包含特定于类型的配置的对象。对于外部文件，对象的键是 external ，
     */
    @Valid
    private External external;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class External {

        @Size(max = NotionConfig.ANY_URL_SIZE, message = NotionConfig.ANY_URL_MESSAGE)
        private String url;

    }

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public ExternalFile(Boolean initType) {
        if (initType) {
            type = EXTERNAL;
        }
    }

}
