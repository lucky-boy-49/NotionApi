package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import com.lucky.notionapi.model.user.User;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 无法保证检索页面端点为每个 people 页面属性返回超过 25 人。如果 people 页面属性包含超过 25 人，
 * 则您可以使用特定 people 属性的检索页面属性项端点来获取完整的人员列表。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeoplePageProperties extends AbstractPageProperties {

    /**
     * 用户对象的数组。
     */
    @JsonProperty("people")
    @Size(max = NotionConfig.ANY_PEOPLE_SIZE, message = NotionConfig.ANY_PEOPLE_MESSAGE)
    private User[] people;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public PeoplePageProperties(Boolean initType) {
        if (initType) {
            type = PEOPLE;
        }
    }

}
