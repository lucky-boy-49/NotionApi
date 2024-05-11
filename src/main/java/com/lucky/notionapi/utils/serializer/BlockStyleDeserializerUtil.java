package com.lucky.notionapi.utils.serializer;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.lucky.notionapi.model.block.BlockStyle;

import java.io.IOException;

/**
 * 块反序列化工具
 * @author jiahe
 */
public class BlockStyleDeserializerUtil extends JsonDeserializer<BlockStyle> {
    @Override
    public BlockStyle deserialize(JsonParser jp, DeserializationContext dc) throws IOException, JacksonException {
        JsonNode node = jp.getCodec().readTree(jp);
        String type = node.get("type").asText();
        return null;
    }
}
