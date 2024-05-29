package com.lucky.notionapi;

import com.lucky.notionapi.service.impl.AuthenticateServiceImpl;
import com.lucky.notionapi.service.impl.BlockServiceImpl;
import com.lucky.notionapi.service.impl.DatabaseServiceImpl;
import com.lucky.notionapi.service.impl.PageServiceImpl;

public record NotionClient(AuthenticateServiceImpl authenticateService, BlockServiceImpl blockService,
                           PageServiceImpl pageService, DatabaseServiceImpl databaseService) {

}
