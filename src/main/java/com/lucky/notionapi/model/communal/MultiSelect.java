package com.lucky.notionapi.model.communal;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 数据库多选属性
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiSelect {

    /**
     * 选项
     */
    private Options[] options;

}
