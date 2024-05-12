package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 创建时间
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class CreatedTimeProperties extends AbstractProperties {

    @JsonProperty("created_time")
    private LocalDateTime createdTime;

}
