package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.communal.MultiSelect;
import com.lucky.notionapi.model.communal.Options;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 多选
 * 如果您想通过更新页面或更新数据库端点向多选属性添加新选项，则您的集成需要对父数据库的写入访问权限。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultiSelectPageProperties extends AbstractPageProperties {

    /**
     * 更新时使用
     */
    @JsonProperty(value = "multi_select", access = JsonProperty.Access.READ_ONLY)
    private Options[] options;

    /**
     * 获取时使用
     */
    @JsonProperty(value = "multi_select", access = JsonProperty.Access.WRITE_ONLY)
    private MultiSelect multiSelect;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public MultiSelectPageProperties(Boolean initType) {
        if (initType) {
            type = MULTI_SELECT;
        }
    }

}
