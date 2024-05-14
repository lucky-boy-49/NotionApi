package com.lucky.notionapi.model.page.properties.type;

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
public class UniqueIDPageProperties extends AbstractPageProperties {

    @JsonProperty("unique_id")
    private UniqueID uniqueId;

    @Data
    static class UniqueID {

        private Integer number;

        private String prefix;

    }

}
