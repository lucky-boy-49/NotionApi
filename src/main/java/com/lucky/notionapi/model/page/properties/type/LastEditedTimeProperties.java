package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 最后编辑时间
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LastEditedTimeProperties extends AbstractProperties {

    /**
     * 页面上次编辑的日期和时间。
     * 无法更新。
     */
    @JsonProperty("last_edited_time")
    private LocalDateTime lastEditedTime;

}
