package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.dto.ListAllUsersDto;
import com.lucky.notionapi.model.user.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UsersServiceImplTest {

    @Autowired
    private NotionClient client;

    @Test
    void listAllUsers() {
        ListAllUsersDto response = client.usersService().listAllUsers(null, null);
        System.out.println(response);
    }

    @Test
    void retrieveUser() {
        User response = client.usersService().retrieveUser("5a4cbcce-93a6-4afe-a55e-397188bf40ca");
        System.out.println(response);
    }

    @Test
    void retrieveTokenBotUser() {
        User response = client.usersService().retrieveTokenBotUser();
        System.out.println(response);
    }
}