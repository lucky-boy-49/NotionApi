package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.CreateCommentDao;
import com.lucky.notionapi.dto.RetrieveCommentsDto;
import com.lucky.notionapi.model.comment.Comment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;

/**
 * 评论服务<br>
 * 创建评论、检索评论
 *
 * @author jiahe
 */
@HttpExchange("/v1/comments")
public interface CommentsService {

    /**
     * 读取页面或块中未解决的注释对象列表。
     *
     * @param blockId     块或页面的标识符
     * @param startCursor 如果提供，该端点将返回从所提供的游标之后开始的结果页。如果没有提供，该端点将返回第一页结果。
     * @param pageSize    回复中希望从完整列表中获取的项目数。最大值：100
     * @return 评论列表
     */
    @GetExchange
    ResponseEntity<RetrieveCommentsDto> retrieveComments(@RequestParam(value = "block_id") String blockId,
                                                         @RequestParam(value = "start_cursor", required = false) String startCursor,
                                                         @RequestParam(value = "start_cursor", required = false) Integer pageSize);

    /**
     * 在页面或现有讨论中创建评论。
     *
     * @param body 评论内容与参数
     * @return 评论信息
     */
    @PostExchange
    ResponseEntity<Comment> createComment(@RequestBody CreateCommentDao body);

}
