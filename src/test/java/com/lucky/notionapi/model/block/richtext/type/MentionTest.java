package com.lucky.notionapi.model.block.richtext.type;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;


class MentionTest {

    @Test
    void test() throws JsonProcessingException {
        String json = "{\n" +
                "    \"type\": \"page\",\n" +
                "    \"page\": {\n" +
                "      \"id\": \"12345678-1234-1234-1234-123456789012\"\n" +
                "    }\n" +
                "}";
        ObjectMapper mapper = new ObjectMapper();
        Mention mention = mapper.readValue(json, Mention.class);
        System.out.println(mention.toString());
    }

}