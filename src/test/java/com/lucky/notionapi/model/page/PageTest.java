package com.lucky.notionapi.model.page;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

class PageTest {

    @Test
    void test() throws JsonProcessingException {
        String pageString = "{\n" +
                "            \"object\": \"page\",\n" +
                "            \"id\": \"9fe91fc6-5d5f-43ed-b3f2-6c9166caa79f\",\n" +
                "            \"created_time\": \"2024-05-12T03:53:00.000Z\",\n" +
                "            \"last_edited_time\": \"2024-05-12T04:35:00.000Z\",\n" +
                "            \"created_by\": {\n" +
                "                \"object\": \"user\",\n" +
                "                \"id\": \"5a4cbcce-93a6-4afe-a55e-397188bf40ca\"\n" +
                "            },\n" +
                "            \"last_edited_by\": {\n" +
                "                \"object\": \"user\",\n" +
                "                \"id\": \"5a4cbcce-93a6-4afe-a55e-397188bf40ca\"\n" +
                "            },\n" +
                "            \"cover\": null,\n" +
                "            \"icon\": null,\n" +
                "            \"parent\": {\n" +
                "                \"type\": \"database_id\",\n" +
                "                \"database_id\": \"917417f5-eef6-47a6-b151-a67d1345aaea\"\n" +
                "            },\n" +
                "            \"archived\": false,\n" +
                "            \"in_trash\": false,\n" +
                "            \"properties\": {\n" +
                "                \"最后编辑\": {\n" +
                "                    \"id\": \"Je%5CG\",\n" +
                "                    \"type\": \"last_edited_time\",\n" +
                "                    \"last_edited_time\": \"2024-05-12T04:35:00.000Z\"\n" +
                "                },\n" +
                "                \"作者\": {\n" +
                "                    \"id\": \"KDEZ\",\n" +
                "                    \"type\": \"rich_text\",\n" +
                "                    \"rich_text\": [\n" +
                "                        {\n" +
                "                            \"type\": \"text\",\n" +
                "                            \"text\": {\n" +
                "                                \"content\": \"test\",\n" +
                "                                \"link\": null\n" +
                "                            },\n" +
                "                            \"annotations\": {\n" +
                "                                \"bold\": false,\n" +
                "                                \"italic\": false,\n" +
                "                                \"strikethrough\": false,\n" +
                "                                \"underline\": false,\n" +
                "                                \"code\": false,\n" +
                "                                \"color\": \"default\"\n" +
                "                            },\n" +
                "                            \"plain_text\": \"test\",\n" +
                "                            \"href\": null\n" +
                "                        }\n" +
                "                    ]\n" +
                "                },\n" +
                "                \"笔记数\": {\n" +
                "                    \"id\": \"Rz%5E%5D\",\n" +
                "                    \"type\": \"number\",\n" +
                "                    \"number\": null\n" +
                "                },\n" +
                "                \"读书状态\": {\n" +
                "                    \"id\": \"_kBF\",\n" +
                "                    \"type\": \"select\",\n" +
                "                    \"select\": null\n" +
                "                },\n" +
                "                \"最后标记\": {\n" +
                "                    \"id\": \"nEqh\",\n" +
                "                    \"type\": \"date\",\n" +
                "                    \"date\": null\n" +
                "                },\n" +
                "                \"上次同步\": {\n" +
                "                    \"id\": \"xx%3A%3C\",\n" +
                "                    \"type\": \"date\",\n" +
                "                    \"date\": null\n" +
                "                },\n" +
                "                \"开始时间\": {\n" +
                "                    \"id\": \"%7BjXS\",\n" +
                "                    \"type\": \"date\",\n" +
                "                    \"date\": null\n" +
                "                },\n" +
                "                \"Title\": {\n" +
                "                    \"id\": \"title\",\n" +
                "                    \"type\": \"title\",\n" +
                "                    \"title\": [\n" +
                "                        {\n" +
                "                            \"type\": \"text\",\n" +
                "                            \"text\": {\n" +
                "                                \"content\": \"tetest1\",\n" +
                "                                \"link\": null\n" +
                "                            },\n" +
                "                            \"annotations\": {\n" +
                "                                \"bold\": false,\n" +
                "                                \"italic\": false,\n" +
                "                                \"strikethrough\": false,\n" +
                "                                \"underline\": false,\n" +
                "                                \"code\": false,\n" +
                "                                \"color\": \"default\"\n" +
                "                            },\n" +
                "                            \"plain_text\": \"tetest1\",\n" +
                "                            \"href\": null\n" +
                "                        }\n" +
                "                    ]\n" +
                "                }\n" +
                "            },\n" +
                "            \"url\": \"https://www.notion.so/tetest1-9fe91fc65d5f43edb3f26c9166caa79f\",\n" +
                "            \"public_url\": null\n" +
                "        }";
        ObjectMapper objectMapper = new ObjectMapper();
        Page page = objectMapper.readValue(pageString, Page.class);
        System.out.println(objectMapper.writeValueAsString(page));
    }

}