package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 日期
 *
 * @author 贺佳
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class DateProperties extends AbstractProperties {

    private Date date;

    @Data
    static class Date {

        /**
         * （可选）表示日期范围结束的字符串。
         * 如果值为 null ，则日期值不是范围。
         */
        private LocalDateTime start;

        /**
         * 如果 date 值是一个范围，则 start 表示该范围的开始。
         */
        private LocalDateTime end;

        @JsonProperty("time_zone")
        private String timeZone;


    }

}
