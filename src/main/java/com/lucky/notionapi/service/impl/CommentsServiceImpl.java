package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.annotation.Notion;
import com.lucky.notionapi.dao.CreateCommentDao;
import com.lucky.notionapi.dto.RetrieveCommentsDto;
import com.lucky.notionapi.model.comment.Comment;
import com.lucky.notionapi.service.CommentsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

/**
 * 评论服务
 *
 * @author jiahe
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class CommentsServiceImpl {

    private final HttpServiceProxyFactory factory;

    /**
     * 检索评论
     *
     * @param blockId     块或页面的标识符
     * @param startCursor 开始游标
     * @param pageSize    每页大小
     * @return 评论列表
     */
    @Notion("检索评论")
    public RetrieveCommentsDto retrieveComments(String blockId, String startCursor, Integer pageSize) {
        CommentsService client = factory.createClient(CommentsService.class);
        return client.retrieveComments(blockId, startCursor, pageSize).getBody();
    }

    /**
     * 创建评论
     *
     * @param body 评论内容
     * @return 评论信息
     */
    @Notion("创建评论")
    public Comment createComment(@Validated CreateCommentDao body) {
        CommentsService client = factory.createClient(CommentsService.class);
        return client.createComment(body).getBody();
    }

}
