package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 电话号码
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PhoneNumberPageProperties extends AbstractPageProperties {

    @JsonProperty("phone_number")
    private String phoneNumber;

}