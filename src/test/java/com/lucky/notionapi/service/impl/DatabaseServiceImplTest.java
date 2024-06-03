package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.dao.DatabaseDao;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.block.richtext.type.TextRichText;
import com.lucky.notionapi.model.database.Database;
import com.lucky.notionapi.model.database.properties.type.TitleDatabaseProperties;
import com.lucky.notionapi.model.parent.type.PageParent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DatabaseServiceImplTest {

    @Autowired
    private NotionClient client;

    @Test
    void createDatabase() {
        DatabaseDao body = new DatabaseDao();

        // 父类信息
        PageParent parent = new PageParent();
        parent.setPageId("89529312369f46cca58b3d98a4c15114");
        body.setParent(parent);

        // 标题
        TextRichText title = new TextRichText();
        title.setText(new TextRichText.Text());
        title.getText().setContent("数据库测试2");
        body.setTitle(new RichTextType[]{title});

        // 属性
        TextRichText text = new TextRichText();
        TitleDatabaseProperties titleDatabaseProperties = new TitleDatabaseProperties();
        titleDatabaseProperties.setTitle(text);
        titleDatabaseProperties.setCustomizeName("作者");
        body.setProperties(List.of(titleDatabaseProperties));

        Database result = client.databaseService().createDatabase(body);
        System.out.println(result);
    }
}