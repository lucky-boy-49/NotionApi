package com.lucky.notionapi.model.file;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
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
    private External external;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class External {

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
