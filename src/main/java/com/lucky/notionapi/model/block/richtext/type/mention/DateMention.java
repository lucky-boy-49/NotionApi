package com.lucky.notionapi.model.block.richtext.type.mention;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 日期提及类型对象
 * 日期提及在相应的 date 字段中包含日期属性值对象。
 * @author jiahe
 */
@Data
public class DateMention implements Mention {

    private String type;

    private Date date;

    @Data
    static class Date {

        private LocalDateTime start;

        private LocalDateTime end;

    }

}
