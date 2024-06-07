package com.lucky.notionapi;

import com.lucky.notionapi.service.*;

public record NotionClient(AuthenticateService authenticateService, BlockService blockService,
                           PageService pageService, DatabaseService databaseService,
                           UsersService usersService, CommentsService commentsService,
                           SearchService searchService) {

}
