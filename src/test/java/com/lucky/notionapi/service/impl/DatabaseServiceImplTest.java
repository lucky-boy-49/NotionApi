package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.dao.DatabaseDao;
import com.lucky.notionapi.dao.QueryDatabaseDao;
import com.lucky.notionapi.dto.QueryDatabaseDto;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.block.richtext.type.TextRichText;
import com.lucky.notionapi.model.database.Database;
import com.lucky.notionapi.model.database.filter.conditions.RelationFilter;
import com.lucky.notionapi.model.database.properties.type.TitleDatabaseProperties;
import com.lucky.notionapi.model.database.sort.PropertySort;
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

    @Test
    void queryDatabase() {
        QueryDatabaseDao body = new QueryDatabaseDao();
        body.setStartCursor("7727107a-cad7-44e6-89ba-6ebdce1ab848");
        body.setPageSize(1);
        RelationFilter filter = new RelationFilter();
        filter.setProperty("父任务");
        filter.setRelation(new RelationFilter.RelationConditions());
        filter.getRelation().setContains("a4b40cf6-e9e8-4e20-bac6-932bbb80748d");
        body.setFilter(filter);
        PropertySort sort = new PropertySort();
        sort.setProperty("最后编写时间");
        sort.setDirection("descending");
        body.setSorts(List.of(sort).toArray(new PropertySort[0]));

        QueryDatabaseDto result = client.databaseService().queryDatabase("18b5c7f05ce04ffeb4c329b5bb71a7e3", body);
        System.out.println(result);
    }

    @Test
    void searchDatabase() {
        Database result = client.databaseService().retrieveDatabase("917417f5eef647a6b151a67d1345aaea");
        System.out.println(result);
    }
}