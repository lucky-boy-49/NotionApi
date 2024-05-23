package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.block.richtext.type.TextRichText;
import com.lucky.notionapi.model.block.type.QuoteBlock;
import com.lucky.notionapi.model.page.Page;
import com.lucky.notionapi.model.page.properties.type.TitlePageProperties;
import com.lucky.notionapi.model.parent.type.PageParent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PageServiceImplTest {

    @Autowired
    private NotionClient client;

    @Test
    void createPage() {

        Page page = new Page();
        PageParent parent = new PageParent();
        parent.setPageId("89529312369f46cca58b3d98a4c15114");
        page.setParent(parent);
        TitlePageProperties title = new TitlePageProperties();
        TextRichText richText = new TextRichText();
        richText.setText(new TextRichText.Text());
        richText.getText().setContent("测试标题");
        title.setTitle(new RichTextType[]{richText});
        title.setCustomizeName("title");
        page.setProperties(List.of(title));

        QuoteBlock quoteBlock = new QuoteBlock();
        quoteBlock.setQuote(new QuoteBlock.Quote());
        TextRichText textRichText = new TextRichText();
        textRichText.setText(new TextRichText.Text());
        textRichText.getText().setContent("notion更新测试");
        quoteBlock.getQuote().setRichText(new RichTextType[]{textRichText});
        page.setChildren(new BlockType[]{quoteBlock});

        Page responsePage = client.pageService().createPage(page);
        System.out.println(responsePage);

    }

    @Test
    void queryPage() {
        Page page = client.pageService().queryPage("89529312369f46cca58b3d98a4c15114", null);
        System.out.println(page);
    }
}