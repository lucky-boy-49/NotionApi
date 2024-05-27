package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 唯一身份<br>
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UniqueIDPageProperties extends AbstractPageProperties {

    @JsonProperty("unique_id")
    private UniqueID uniqueId;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class UniqueID {

        private Integer number;

        private String prefix;

    }

    public UniqueIDPageProperties() {
        type = UNIQUE_ID;
    }

}
