package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 创建者属性值<br>
 * 由属性值创建的对象在 created_by 属性中包含一个用户对象。用户对象描述了创建该页面的用户。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatedByPropertyDao extends AbstractPropertyItem {

    @JsonProperty("created_by")
    private User createdBy;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public CreatedByPropertyDao(Boolean initType) {
        if (initType) {
            type = CREATED_BY;
        }
    }

}
