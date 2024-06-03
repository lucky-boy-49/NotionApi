package com.lucky.notionapi.model.user.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lucky.notionapi.model.user.AbstractUser;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 代表人物的用户对象的 type 属性设置为 "person"
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class People extends AbstractUser {

    /**
     * 包含人员的电子邮件地址。仅当集成具有允许访问电子邮件地址的用户功能时，才会出现此情况
     */
    public ObjectNode person;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public People(Boolean initType) {
        if (initType) {
            type = "person";
        }
    }

}
