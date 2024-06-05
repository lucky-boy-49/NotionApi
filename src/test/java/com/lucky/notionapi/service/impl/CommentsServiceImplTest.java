package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.dto.RetrieveCommentsDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommentsServiceImplTest {

    @Autowired
    private NotionClient client;

    @Test
    void retrieveComments() {
        RetrieveCommentsDto response = client.commentsService().retrieveComments("f943bff8-0e0e-4691-8a89-819fceb4fe60", null, null);
        System.out.println(response);
    }
}