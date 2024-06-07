package com.lucky.notionapi.model.block.richtext.type;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucky.notionapi.model.communal.richtext.type.mention.Mention;
import org.junit.jupiter.api.Test;


class MentionTest {

    @Test
    void test() throws JsonProcessingException {
        String json = """
                {
                    "type": "page",
                    "page": {
                      "id": "12345678-1234-1234-1234-123456789012"
                    }
                }""";
        ObjectMapper mapper = new ObjectMapper();
        Mention mention = mapper.readValue(json, Mention.class);
        System.out.println(mention.toString());
    }

}