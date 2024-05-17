package com.lucky.notionapi;

import com.lucky.notionapi.service.impl.AuthenticateServiceImpl;
import com.lucky.notionapi.service.impl.BlockServiceImpl;

public record NotionClient(AuthenticateServiceImpl authenticateService, BlockServiceImpl blockService) {

}
