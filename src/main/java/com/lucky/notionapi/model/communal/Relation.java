package com.lucky.notionapi.model.communal;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/**
 * 关系属性值对象包含一个 relation 属性项数组，在 relation 属性中包含页面引用。页面引用是一个具有 id 属性的对象，该属性是一个字符串值（UUIDv4），与另一个数据库中的页面 ID 相对应。
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Relation {

    private String id;

}
