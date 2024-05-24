package com.lucky.notionapi.dao.propertyitem.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.dao.propertyitem.AbstractPropertyItem;
import com.lucky.notionapi.model.file.FileType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 文件属性值<br>
 * 文件属性值对象包含 files 属性中的文件引用数组。文件引用是一个具有文件对象和 name 属性的对象，其字符串值与原始上传文件的文件名相对应（即 "Whole_Earth_Catalog.jpg" ）。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilesPropertyDao extends AbstractPropertyItem {

    private FileType[] files;

}
