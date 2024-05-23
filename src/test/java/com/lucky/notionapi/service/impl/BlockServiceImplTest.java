package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.dao.BlockAddRequestDao;
import com.lucky.notionapi.dao.BlockAddResponseDao;
import com.lucky.notionapi.enumerate.Color;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.block.richtext.RichTextType;
import com.lucky.notionapi.model.block.richtext.type.TextRichText;
import com.lucky.notionapi.model.block.type.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BlockServiceImplTest {

    @Autowired
    private NotionClient client;

    @Test
    void appendBlockChildrenBookmarkBlock() {
        BlockAddRequestDao requestDao = new BlockAddRequestDao();
        BlockType[] children = new BlockType[1];
        // 书签块
        BookmarkBlock bookmarkBlock = new BookmarkBlock();
        bookmarkBlock.setBookmark(new BookmarkBlock.Bookmark());
        TextRichText caption = new TextRichText();
        caption.setText(new TextRichText.Text());
        caption.getText().setContent("notion追加测试");
        bookmarkBlock.getBookmark().setCaption(new RichTextType[]{caption});
        bookmarkBlock.getBookmark().setUrl("https://notionchina.co/guide/images-videos-files-embeds/web-bookmarks.html");
        children[0] = bookmarkBlock;
        requestDao.setChildren(children);
        BlockAddResponseDao blockAddResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockAddResponseDao);
    }

    @Test
    void appendBlockChildrenBreadcrumbBlock() {
        BlockAddRequestDao requestDao = new BlockAddRequestDao();
        BlockType[] children = new BlockType[1];
        BreadcrumbBlock breadcrumbBlock = new BreadcrumbBlock();
        children[0] = breadcrumbBlock;
        breadcrumbBlock.setBreadcrumb(new BreadcrumbBlock.Breadcrumb());
        requestDao.setChildren(children);
        BlockAddResponseDao blockAddResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockAddResponseDao);
    }

    @Test
    void appendBlockChildrenBulletedListItemBlock() {
        BlockAddRequestDao requestDao = new BlockAddRequestDao();
        BlockType[] children = new BlockType[1];
        BulletedListItemBlock bulletedListItemBlock = new BulletedListItemBlock();
        children[0] = bulletedListItemBlock;
        BulletedListItemBlock.BulletedListItem bulletedListItem = new BulletedListItemBlock.BulletedListItem();
        TextRichText textRichText = new TextRichText();
        textRichText.setText(new TextRichText.Text());
        textRichText.getText().setContent("notion追加测试项目符号列表项");
        bulletedListItem.setRichText(new RichTextType[]{textRichText});
        bulletedListItem.setColor(Color.BLUE.getColor());
        bulletedListItemBlock.setBulletedListItem(bulletedListItem);
        requestDao.setChildren(children);
        BlockAddResponseDao blockAddResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockAddResponseDao);
    }

    @Test
    void appendBlockChildrenCalloutBlock() {
        BlockAddRequestDao requestDao = new BlockAddRequestDao();
        BlockType[] children = new BlockType[1];
        CalloutBlock calloutBlock = new CalloutBlock();
        children[0] = calloutBlock;
        CalloutBlock.Callout callout = new CalloutBlock.Callout();
        TextRichText textRichText = new TextRichText();
        textRichText.setText(new TextRichText.Text());
        textRichText.getText().setContent("notion追加标注");
        callout.setRichText(new RichTextType[]{textRichText});
        callout.setColor(Color.BLUE.getColor());
        calloutBlock.setCallout(callout);
        requestDao.setChildren(children);
        BlockAddResponseDao blockAddResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockAddResponseDao);
    }

    @Test
    void appendBlockCodeBlock() {
        BlockAddRequestDao requestDao = new BlockAddRequestDao();
        BlockType[] children = new BlockType[1];

        CodeBlock codeBlock = new CodeBlock();
        children[0] = codeBlock;
        CodeBlock.Code code = new CodeBlock.Code();
        code.setLanguage("java");
        TextRichText caption = new TextRichText();
        caption.setText(new TextRichText.Text());
        caption.getText().setContent("Java代码追加测试");
        TextRichText richText = new TextRichText();
        richText.setText(new TextRichText.Text());
        richText.getText().setContent("@Test\n" +
                "    void appendBlockCodeBlock() {\n" +
                "        BlockAddRequestDao requestDao = new BlockAddRequestDao();\n" +
                "        BlockType[] children = new BlockType[1];\n" +
                "\n" +
                "        CodeBlock codeBlock = new CodeBlock();\n" +
                "        children[0] = codeBlock;\n" +
                "        CodeBlock.Code code = new CodeBlock.Code();\n" +
                "        code.setLanguage(\"java\");\n" +
                "        TextRichText caption = new TextRichText();\n" +
                "        caption.setText(new TextRichText.Text());\n" +
                "        caption.getText().setContent(\"Java代码追加测试\");\n" +
                "        TextRichText richText = new TextRichText();\n" +
                "        richText.setText(new TextRichText.Text());\n" +
                "        richText.getText().setContent(\"Java代码追加测试\");\n" +
                "        code.setCaption(new RichTextType[]{caption});\n" +
                "        code.setRichText(new RichTextType[]{richText});\n" +
                "        codeBlock.setCode(code);\n" +
                "\n" +
                "        requestDao.setChildren(children);\n" +
                "        BlockAddResponseDao blockAddResponseDao = client.blockService().appendBlockChildren(requestDao, \"89529312369f46cca58b3d98a4c15114\");\n" +
                "        System.out.println(blockAddResponseDao);\n" +
                "    }");
        code.setCaption(new RichTextType[]{caption});
        code.setRichText(new RichTextType[]{richText});
        codeBlock.setCode(code);

        requestDao.setChildren(children);
        BlockAddResponseDao blockAddResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockAddResponseDao);
    }

    @Test
    void retrieveBlock() {
    }
}