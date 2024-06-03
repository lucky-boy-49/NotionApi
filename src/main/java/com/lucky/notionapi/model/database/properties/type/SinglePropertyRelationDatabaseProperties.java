package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 单一属性关系对象在 single_property 属性中没有附加配置。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SinglePropertyRelationDatabaseProperties extends AbstractRelationDatabaseConfiguration {

    @JsonProperty("single_property")
    private SingleProperty singleProperty;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class SingleProperty {

    }

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public SinglePropertyRelationDatabaseProperties(Boolean initType) {
        if (initType) {
            type = SINGLE_PROPERTY;
        }
    }

}
