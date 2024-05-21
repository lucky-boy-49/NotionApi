package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 由数据库创建的属性在 Notion UI 中呈现为一列，其中包含人们提及的每行作者作为值。created_by 类型对象为空。没有额外的属性配置。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatedByDatabaseProperties extends AbstractDatabaseProperties {

    @JsonProperty("created_by")
    private CreatedBy createdBy;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class CreatedBy {

    }

}
