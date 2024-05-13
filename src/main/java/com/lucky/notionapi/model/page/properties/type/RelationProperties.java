package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.page.properties.AbstractProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 关系<br>
 * 要通过 API 更新 relation 属性值，请与集成共享相关的父数据库。<br>
 * 如果 relation 属性值意外为空，请确保您已与集成共享 relation 指向的原始源数据库。<br>
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class RelationProperties extends AbstractProperties {

    /**
     * 如果 relation 具有超过 25 个引用，则响应对象中关系的 has_more 值为 true 。<br>
     * 如果关系不超过限制，则 has_more 为 false 。<br>
     */
    @JsonProperty("has_more")
    private Boolean hasMore;

    /**
     * 相关页面引用的数组。页面引用是一个具有 id 键和与另一个数据库中的页面 ID 相对应的字符串值的对象。
     */
    private Relation[] relation;

    @Data
    static class Relation {

        private String id;

    }

}
