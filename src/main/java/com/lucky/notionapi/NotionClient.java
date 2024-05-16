package com.lucky.notionapi;

import com.lucky.notionapi.service.impl.AuthenticateServiceImpl;
import lombok.RequiredArgsConstructor;

/**
 * Notion客户端
 * @author jiahe
 */
@RequiredArgsConstructor
public class NotionClient {

    private final AuthenticateServiceImpl authenticateService;

}
