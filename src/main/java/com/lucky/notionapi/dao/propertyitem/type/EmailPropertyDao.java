package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 电子邮件属性值<br>
 * 电子邮件属性值对象的 email 属性中包含一个字符串。该字符串描述了一个电子邮件地址（即 "hello@example.org" ）。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmailPropertyDao extends AbstractPropertyItem {

    private String email;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public EmailPropertyDao(Boolean initType) {
        if (initType) {
            type = EMAIL;
        }
    }

}
