package com.lucky.notionapi.model.block.richtext.type.mention;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 日期提及类型对象
 * 日期提及在相应的 date 字段中包含日期属性值对象。
 * @author jiahe
 */
@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateMention implements Mention {

    private String type;

    private Date date;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public DateMention(Boolean initType) {
        if (initType) {
            type = DATE;
        }
    }

}
