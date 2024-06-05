package com.lucky.notionapi;

import com.lucky.notionapi.service.impl.*;

public record NotionClient(AuthenticateServiceImpl authenticateService, BlockServiceImpl blockService,
                           PageServiceImpl pageService, DatabaseServiceImpl databaseService,
                           UsersServiceImpl usersService, CommentsServiceImpl commentsService) {

}
