package com.lucky.notionapi.service.impl;

import com.lucky.notionapi.NotionClient;
import com.lucky.notionapi.dao.BlockAddRequestDao;
import com.lucky.notionapi.dao.BlockResponseDao;
import com.lucky.notionapi.enumerate.ColorEnum;
import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.block.type.*;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.communal.richtext.type.TextRichText;
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
        caption.getText().setContent("notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试not" +
                "ion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试notion追加测试");
        bookmarkBlock.getBookmark().setCaption(new RichTextType[]{caption});
        bookmarkBlock.getBookmark().setUrl("https://notionchina.co/guide/images-videos-files-embeds/web-bookmarks.html");
        children[0] = bookmarkBlock;
        requestDao.setChildren(children);
        BlockResponseDao blockResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockResponseDao);
    }

    @Test
    void appendBlockChildrenBreadcrumbBlock() {
        BlockAddRequestDao requestDao = new BlockAddRequestDao();
        BlockType[] children = new BlockType[1];
        BreadcrumbBlock breadcrumbBlock = new BreadcrumbBlock();
        children[0] = breadcrumbBlock;
        breadcrumbBlock.setBreadcrumb(new BreadcrumbBlock.Breadcrumb());
        requestDao.setChildren(children);
        BlockResponseDao blockResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockResponseDao);
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
        bulletedListItem.setColor(ColorEnum.BLUE.getColor());
        bulletedListItemBlock.setBulletedListItem(bulletedListItem);
        requestDao.setChildren(children);
        BlockResponseDao blockResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockResponseDao);
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
        callout.setColor(ColorEnum.BLUE.getColor());
        calloutBlock.setCallout(callout);
        requestDao.setChildren(children);
        BlockResponseDao blockResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockResponseDao);
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
        richText.getText().setContent("""
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
                    richText.getText().setContent("Java代码追加测试");
                    code.setCaption(new RichTextType[]{caption});
                    code.setRichText(new RichTextType[]{richText});
                    codeBlock.setCode(code);

                    requestDao.setChildren(children);
                    BlockAddResponseDao blockResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
                    System.out.println(blockResponseDao);
                }""");
        code.setCaption(new RichTextType[]{caption});
        code.setRichText(new RichTextType[]{richText});
        codeBlock.setCode(code);

        requestDao.setChildren(children);
        BlockResponseDao blockResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockResponseDao);
    }

    @Test
    void appendBlockColumnListBlock() {
        BlockAddRequestDao requestDao = new BlockAddRequestDao();
        BlockType[] children = new BlockType[1];

        ColumnListBlock columnListBlock = new ColumnListBlock();
        ColumnBlock columnBlock1 = new ColumnBlock();
        columnBlock1.setColumn(new ColumnBlock.Column());
        TextRichText textRichText = new TextRichText();
        textRichText.setText(new TextRichText.Text());
        textRichText.getText().setContent("notion追加测试1");
        CalloutBlock calloutBlock = new CalloutBlock();
        calloutBlock.setCallout(new CalloutBlock.Callout());
        calloutBlock.getCallout().setRichText(new RichTextType[]{textRichText});
        columnBlock1.getColumn().setChildren(new BlockType[]{calloutBlock});
        ColumnBlock columnBlock2 = new ColumnBlock();
        columnBlock2.setColumn(new ColumnBlock.Column());
        TextRichText textRichText2 = new TextRichText();
        textRichText2.setText(new TextRichText.Text());
        textRichText2.getText().setContent("notion追加测试1");
        CalloutBlock calloutBlock2 = new CalloutBlock();
        calloutBlock2.setCallout(new CalloutBlock.Callout());
        calloutBlock2.getCallout().setRichText(new RichTextType[]{textRichText2});
        columnBlock2.getColumn().setChildren(new BlockType[]{calloutBlock2});
        columnListBlock.setColumnList(new ColumnListBlock.ColumnList());
        columnListBlock.getColumnList().setChildren(new ColumnBlock[]{columnBlock1, columnBlock2});
        children[0] = columnListBlock;

        requestDao.setChildren(children);
        BlockResponseDao blockResponseDao = client.blockService().appendBlockChildren(requestDao, "89529312369f46cca58b3d98a4c15114");
        System.out.println(blockResponseDao);
    }

    @Test
    void retrieveBlock() {
        BlockType response = client.blockService().retrieveBlock("89529312369f46cca58b3d98a4c15114");
        System.out.println(response);
    }

    @Test
    void retrieveBlockChildren() {
        BlockResponseDao responseDao = client.blockService().retrieveBlockChildren("89529312369f46cca58b3d98a4c15114", null, 100);
        System.out.println(responseDao);
    }

    @Test
    void updateBlock() {
        QuoteBlock quoteBlock = new QuoteBlock();
        quoteBlock.setQuote(new QuoteBlock.Quote());
        TextRichText textRichText = new TextRichText();
        textRichText.setText(new TextRichText.Text());
        textRichText.getText().setContent("notion更新测试");
        quoteBlock.getQuote().setRichText(new RichTextType[]{textRichText});
        BlockType responseBlock = client.blockService().updateBlock("b2049330-5583-46bc-a7b3-7d3a2fb3aa8a", quoteBlock);
        System.out.println(responseBlock);
    }

    @Test
    void deleteBlock() {
        BlockType responseBlock = client.blockService().deleteBlock("b2049330-5583-46bc-a7b3-7d3a2fb3aa8a");
        System.out.println(responseBlock);
    }

}