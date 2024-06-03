package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import com.lucky.notionapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 由...创建
 *
 * @author 贺佳
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatedByPageProperties extends AbstractPageProperties {

    /**
     * 包含有关创建页面的用户的信息的用户对象。
     * created_by 无法更新。
     */
    @JsonProperty("created_by")
    private User createdBy;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public CreatedByPageProperties(Boolean initType) {
        if (initType) {
            type = CREATED_BY;
        }
    }

}
