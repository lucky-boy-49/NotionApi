package com.lucky.notionapi.service;

import com.lucky.notionapi.dao.CreateCommentDao;
import com.lucky.notionapi.dto.RetrieveCommentsDto;
import com.lucky.notionapi.model.comment.Comment;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;

/**
 * 评论接口
 * @author jiahe
 */
@Validated
public interface CommentsService {

    @Validated
    RetrieveCommentsDto retrieveComments(@NotNull String blockId, @Nullable String startCursor, @Nullable Integer pageSize);

    @Validated
    Comment createComment(@Valid CreateCommentDao body);

}
