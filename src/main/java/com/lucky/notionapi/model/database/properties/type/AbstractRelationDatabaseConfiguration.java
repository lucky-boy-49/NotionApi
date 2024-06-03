package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 关系数据库属性对象在 relation 属性中包含以下配置。此外，它们还必须包含一个与 type 值相对应的键。该值是一个包含特定类型配置的对象。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AbstractRelationDatabaseConfiguration extends AbstractDatabaseProperties {

    /**
     * 此关系指向的数据库。该数据库必须与集成共享。
     */
    @JsonProperty("database_id")
    protected String databaseId;

    /**
     * 关系的类型。可以是 "single_property" 或 "dual_property" 。
     */
    protected String type;

}
