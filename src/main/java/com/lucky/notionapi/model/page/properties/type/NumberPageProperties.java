package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 数字
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NumberPageProperties extends AbstractPageProperties {

    /**
     * 更新数据序列化时使用
     */
    // @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Number number;

//    /**
//     * 获取数据，反序列化使用
//     */
//    @JsonProperty(value = "number")
//    private NumberFormat number2;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public NumberPageProperties(Boolean initType) {
        if (initType) {
            type = NUMBER;
        }
    }

}
