package com.lucky.notionapi.model.communal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 数据库多选属性
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiSelect {

    /**
     * 选项
     */
    @Size(max = NotionConfig.ANY_MULTI_SELECT_SIZE, message = NotionConfig.ANY_MULTI_SELECT_MESSAGE)
    private Option[] options;

}
