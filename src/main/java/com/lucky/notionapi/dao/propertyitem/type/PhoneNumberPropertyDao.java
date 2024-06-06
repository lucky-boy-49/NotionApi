package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.config.NotionConfig;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 电话号码属性值<br>
 * 电话号码属性值对象在 phone_number 属性中包含一个字符串。不强制执行结构。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PhoneNumberPropertyDao extends AbstractPropertyItem {

    @JsonProperty("phone_number")
    @Size(max = NotionConfig.ANY_PHONE_NUMBER_SIZE, message = NotionConfig.ANY_PHONE_NUMBER_MESSAGE)
    private String phoneNumber;

}
