package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.Options;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 选择<br>
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatusPageProperties extends AbstractPageProperties {

    private Options status;

    public StatusPageProperties() {
        type = STATUS;
    }

}
