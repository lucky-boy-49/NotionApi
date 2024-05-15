package com.lucky.notionapi.utils.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.lucky.notionapi.model.database.properties.AbstractDatabaseProperties;
import com.lucky.notionapi.model.database.properties.DatabaseProperties;
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
public class DatabasePropertiesDeserializer extends JsonDeserializer<List<DatabaseProperties>> {
    @Override
    public List<DatabaseProperties> deserialize(JsonParser jp, DeserializationContext dc) {
        try {
            List<DatabaseProperties> databasePropertiesList = new LinkedList<>();
            //解析Json
            TreeNode treeNode = jp.getCodec().readTree(jp);
            //遍历Json字符串里面存在属性，并存在set中
            Iterator<String> iterator = treeNode.fieldNames();
            while (iterator.hasNext()) {
                String fieldName = iterator.next();
                TreeNode node = treeNode.get(fieldName);
                AbstractDatabaseProperties properties = jp.getCodec().treeToValue(node, AbstractDatabaseProperties.class);
                properties.setCustomizeName(fieldName);
                databasePropertiesList.add(properties);
            }
            return databasePropertiesList;
        } catch (IOException e) {
            log.error("反序列化页属性失败", e);
        }
        return List.of();
    }
}
