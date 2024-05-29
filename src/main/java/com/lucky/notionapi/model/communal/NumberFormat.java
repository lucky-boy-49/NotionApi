package com.lucky.notionapi.model.communal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.enumerate.NumberFormatEnum;
import lombok.Data;

/**
 * 数字格式
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberFormat {

    /**
     * 数字格式{@link NumberFormatEnum}
     */
    private String format;

}
