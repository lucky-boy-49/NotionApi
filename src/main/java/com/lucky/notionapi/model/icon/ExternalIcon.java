package com.lucky.notionapi.model.icon;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ExternalIcon extends AbstractIcon {

    /**
     * 包含特定于类型的配置的对象。对于外部文件，对象的键是 external ，
     */
    private External external;

    @Data
    static class External {

        private String url;

    }

}
