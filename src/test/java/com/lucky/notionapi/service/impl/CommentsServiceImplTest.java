package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.dao.CreateCommentDao;
import com.lucky.notionapi.dto.RetrieveCommentsDto;
import com.lucky.notionapi.model.comment.Comment;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.communal.richtext.type.TextRichText;
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

    @Test
    void createComment() {
        TextRichText richText = new TextRichText();
        richText.setText(new TextRichText.Text());
        CreateCommentDao body2 = new CreateCommentDao();
        body2.setDiscussionId("7d2e7eee-c706-47ec-8285-fb855de87bbf");
        richText.getText().setContent("评论回复测试");
        body2.setRichText(new RichTextType[]{richText});
        Comment comment2 = client.commentsService().createComment(body2);
        System.out.println(comment2);

    }
}