package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.communal.PhoneNumber;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 电话号码
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PhoneNumberPageProperties extends AbstractPageProperties {

    @JsonProperty(value = "phone_number", access = JsonProperty.Access.READ_ONLY)
    private String phoneNumber;

    @JsonProperty(value = "phone_number", access = JsonProperty.Access.WRITE_ONLY)
    private PhoneNumber phoneNumberObject;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public PhoneNumberPageProperties(Boolean initType) {
        if (initType) {
            type = PHONE_NUMBER;
        }
    }

}
