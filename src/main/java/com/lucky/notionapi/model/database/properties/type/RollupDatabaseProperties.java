package com.lucky.notionapi.model.database.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.communal.Rollup;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 汇总<br>
 * 汇总数据库属性在 Notion UI 中呈现为一列，其中包含汇总值、从相关数据库中提取的特定属性。
 *
 * @author jiahe
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RollupDatabaseProperties extends AbstractDatabaseProperties {

    private Rollup rollup;

    /**
     * 根据{@code initType}情况是否初始化{@code type}
     *
     * @param initType 是否初始化{@code type}
     */
    public RollupDatabaseProperties(Boolean initType) {
        if (initType) {
            type = ROLLUP;
        }
    }

}
