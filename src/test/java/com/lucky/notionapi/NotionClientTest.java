package com.lucky.notionapi;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lucky.notionapi.model.block.BlockType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NotionClientTest {

    @Autowired
    private NotionClient notionClient;

    @Test
    void blockService() {
        BlockType blockType = notionClient.blockService().retrieveBlock("7dd28800-7b00-449d-8452-cc5c5f497ac2");
        ObjectMapper mapper = new ObjectMapper();
        try {
            String s = mapper.writeValueAsString(blockType);
            System.out.println(s);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}