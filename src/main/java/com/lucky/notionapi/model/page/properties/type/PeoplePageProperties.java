package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import com.lucky.notionapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 无法保证检索页面端点为每个 people 页面属性返回超过 25 人。如果 people 页面属性包含超过 25 人，
 * 则您可以使用特定 people 属性的检索页面属性项端点来获取完整的人员列表。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeoplePageProperties extends AbstractPageProperties {

    /**
     * 用户对象的数组。
     */
    @JsonProperty("people")
    private User[] people;

    public PeoplePageProperties() {
        type = PEOPLE;
    }

}
