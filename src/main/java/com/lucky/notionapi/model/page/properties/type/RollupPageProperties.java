package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 汇总<br>
 * 要更改页面的 rollup 属性，请使用 Notion UI。<br>
 * 检索页面和检索页面属性端点都将返回与页面属性相关的信息。如果汇总属性具有超过 25 个引用，则必须使用检索页面属性端点。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RollupPageProperties extends AbstractPageProperties {

    /**
     * 类型决定其他属性值
     */
    private String type;

    /**
     * 针对汇总关系中的每个页面进行评估的函数。
     */
    private String function;

    private ObjectNode[] array;

    private LocalDateTime date;

    private ObjectNode incomplete;

    private Integer number;

    private ObjectNode unsupported;

    public RollupPageProperties() {
        type = ROLLUP;
    }

}
