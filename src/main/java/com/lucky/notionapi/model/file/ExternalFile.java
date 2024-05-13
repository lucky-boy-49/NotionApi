package com.lucky.notionapi.model.file;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExternalFile extends AbstractFile {

    /**
     * 包含特定于类型的配置的对象。对于外部文件，对象的键是 external ，
     */
    private External external;

    @Data
    static class External {

        private String url;

    }

}
