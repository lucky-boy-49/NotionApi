package com.lucky.notionapi.util;

import com.lucky.notionapi.model.block.BlockType;
import com.lucky.notionapi.model.block.type.ColumnBlock;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock1;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock2;
import com.lucky.notionapi.model.block.type.heading.HeadingBlock3;
import com.lucky.notionapi.model.block.type.pdf.Pdf;
import com.lucky.notionapi.model.communal.CodeLanguage;
import com.lucky.notionapi.model.communal.Color;
import com.lucky.notionapi.model.communal.richtext.RichTextType;
import com.lucky.notionapi.model.communal.richtext.type.TextRichText;
import com.lucky.notionapi.model.file.EmojiFile;
import org.junit.jupiter.api.Test;

class BlockUtilsTest {

    @Test
    void creatHeadingBlock1() {
        TextRichText textRichText = RichTextUtils.createTextRichText("测试");
        HeadingBlock1 headingBlock1 = BlockUtils.creatHeadingBlock1(new TextRichText[]{textRichText}, Color.BLUE, false);
        System.out.println(headingBlock1);
    }

    @Test
    void creatHeadingBlock2() {
        TextRichText textRichText = RichTextUtils.createTextRichText("测试");
        HeadingBlock2 headingBlock2 = BlockUtils.creatHeadingBlock2(new TextRichText[]{textRichText}, Color.BLUE, false);
        System.out.println(headingBlock2);
    }

    @Test
    void creatHeadingBlock3() {
        TextRichText textRichText = RichTextUtils.createTextRichText("测试");
        HeadingBlock3 headingBlock3 = BlockUtils.creatHeadingBlock3(new TextRichText[]{textRichText}, Color.BLUE, false);
        System.out.println(headingBlock3);
    }

    @Test
    void creatPdf() {
        Pdf pdf = BlockUtils.creatPdf("FAFWFAWFAW", true);
        System.out.println(pdf);
        pdf = BlockUtils.creatPdf("FAFWFAWFAW", false);
        System.out.println(pdf);
    }

    @Test
    void creatOriginalSyncedBlock() {
        System.out.println(BlockUtils.creatOriginalSyncedBlock(null));
    }

    @Test
    void creatDuplicateSyncedBlock() {
        System.out.println(BlockUtils.creatDuplicateSyncedBlock("ffafeawfew"));
    }

    @Test
    void creatTableBlock() {
        System.out.println(BlockUtils.creatTableBlock(3, false, false));
    }

    @Test
    void creatTableRowsBlock() {
        System.out.println(BlockUtils.creatTableRowsBlock(new RichTextType[]{}));
    }

    @Test
    void creatVideo() {
        System.out.println(BlockUtils.creatVideo("https://www.baidu.com", true));
    }

    @Test
    void creatBookmarkBlock() {
        System.out.println(BlockUtils.creatBookmarkBlock("https://www.baidu.com", new RichTextType[]{}));
    }

    @Test
    void creatBreadcrumbBlock() {
        System.out.println(BlockUtils.creatBreadcrumbBlock());
    }

    @Test
    void creatBulletedListItemBlock() {
        System.out.println(BlockUtils.creatBulletedListItemBlock(new RichTextType[]{}, Color.BLUE, new BlockType[]{}));
    }

    @Test
    void creatCalloutBlock() {
        System.out.println(BlockUtils.creatCalloutBlock(new RichTextType[]{}, new EmojiFile(), Color.GRAY));
    }

    @Test
    void creatChildDatabaseBlock() {
        System.out.println(BlockUtils.creatChildDatabaseBlock("fawfew"));
    }

    @Test
    void creatChildPageBlock() {
        System.out.println(BlockUtils.creatChildPageBlock("fawfew"));
    }

    @Test
    void creatCodeBlock() {
        System.out.println(BlockUtils.creatCodeBlock(null, null, CodeLanguage.C));
    }

    @Test
    void creatColumnBlock() {
        System.out.println(BlockUtils.creatColumnBlock(new BlockType[]{}));
    }

    @Test
    void creatColumnListBlock() {
        System.out.println(BlockUtils.creatColumnListBlock(new ColumnBlock[]{}));
    }

    @Test
    void creatDividerBlock() {
        System.out.println(BlockUtils.creatDividerBlock());
    }

    @Test
    void creatEmbedBlock() {
        System.out.println(BlockUtils.creatEmbedBlock("https://www.baidu.com"));
    }

    @Test
    void creatEquationBlock() {
        System.out.println(BlockUtils.creatEquationBlock("fawfew"));
    }

    @Test
    void creatFileBlock() {
        System.out.println(BlockUtils.creatFileBlock(null));
    }

    @Test
    void creatImageBlock() {
        System.out.println(BlockUtils.creatImageBlock(null));
    }

    @Test
    void creatLinkPreviewBlock() {
        System.out.println(BlockUtils.creatLinkPreviewBlock("https://www.baidu.com"));
    }

    @Test
    void creatNumberedListItemBlock() {
        System.out.println(BlockUtils.creatNumberedListItemBlock(new RichTextType[]{}, Color.BLUE, new BlockType[]{}));
    }

    @Test
    void creatParagraphBlock() {
        System.out.println(BlockUtils.creatParagraphBlock(new RichTextType[]{}, Color.BLUE, new BlockType[]{}));
    }

    @Test
    void creatQuoteBlock() {
        System.out.println(BlockUtils.creatQuoteBlock(new RichTextType[]{}, Color.BLUE, new BlockType[]{}));
    }

    @Test
    void creatTableOfContentsBlock() {
        System.out.println(BlockUtils.creatTableOfContentsBlock(Color.GRAY));
    }

    @Test
    void creatToDoBlock() {
        System.out.println(BlockUtils.creatToDoBlock(new RichTextType[]{}, false, Color.BLUE, new BlockType[]{}));
    }

    @Test
    void creatToggleBlock() {
        System.out.println(BlockUtils.creatToggleBlock(new RichTextType[]{}, Color.BLUE, new BlockType[]{}));
    }
}