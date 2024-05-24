package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.model.communal.Relation;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 关系属性值对象包含一个 relation 属性项数组，在 relation 属性中包含页面引用。页面引用是一个具有 id 属性的对象，该属性是一个字符串值（UUIDv4），与另一个数据库中的页面 ID 相对应。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RelationPropertyDao extends AbstractPropertyItem {

    private Relation relation;

}
