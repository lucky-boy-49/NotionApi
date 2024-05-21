package com.lucky.notionapi.model.file;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 贺佳
 */
@Data
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

}
