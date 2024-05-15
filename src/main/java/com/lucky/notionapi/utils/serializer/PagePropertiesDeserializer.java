package com.lucky.notionapi.utils.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import com.lucky.notionapi.model.page.properties.PageProperties;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 页属性自定义反序列化
 *
 * @author jiahe
 */
@Slf4j
public class PagePropertiesDeserializer extends JsonDeserializer<List<PageProperties>> {
    @Override
    public List<PageProperties> deserialize(JsonParser jp, DeserializationContext dc) {
        try {
            List<PageProperties> pagePropertiesList = new LinkedList<>();
            //解析Json
            TreeNode treeNode = jp.getCodec().readTree(jp);
            //遍历Json字符串里面存在属性，并存在set中
            Iterator<String> iterator = treeNode.fieldNames();
            while (iterator.hasNext()) {
                String fieldName = iterator.next();
                TreeNode node = treeNode.get(fieldName);
                AbstractPageProperties properties = jp.getCodec().treeToValue(node, AbstractPageProperties.class);
                properties.setCustomizeName(fieldName);
                pagePropertiesList.add(properties);
            }
            return pagePropertiesList;
        } catch (IOException e) {
            log.error("反序列化页属性失败", e);
        }
        return List.of();
    }
}
