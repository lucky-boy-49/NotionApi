package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 双属性关系对象在 dual_property 属性中没有附加配置。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DualPropertyRelationDatabaseProperties extends AbstractRelationDatabaseConfiguration {

    @JsonProperty("dual_property")
    private DualProperty dualProperty;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class DualProperty {

    }

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public DualPropertyRelationDatabaseProperties(Boolean initType) {
        if (initType) {
            type = DUAL_PROPERTY;
        }
    }

}
