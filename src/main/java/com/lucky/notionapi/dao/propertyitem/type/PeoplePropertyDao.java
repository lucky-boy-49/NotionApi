package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.model.user.User;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 人员属性
 * 人员属性值对象包含一个用户对象数组，该数组位于 people 属性内。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PeoplePropertyDao extends AbstractPropertyItem {

    @Size(max = NotionConfig.ANY_PEOPLE_SIZE, message = NotionConfig.ANY_PEOPLE_MESSAGE)
    private User[] people;

}
