package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 日期属性值对象
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DatePropertyDao extends AbstractPropertyItem {

    private Date date;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Date {

        /**
         * ISO 8601 格式的日期，可选择时间。
         */
        private String start;

        /**
         * ISO 8601 格式的日期，可选时间。代表日期范围的结束。<br>
         * 如果 null ，此属性的日期值不是一个范围。
         */
        private String end;

        /**
         * start 和 end 的时区信息。<br>
         * 提供时区时， start 和 end 不应有任何 UTC 偏移。此外，当提供时区时， start 和 end 不能是没有时间信息的日期。<br>
         * 如果使用 null ，时区信息将包含在 start 和 end 中的 UTC 偏移量中。
         */
        @JsonProperty("time_zone")
        private String timeZone;

    }

}
