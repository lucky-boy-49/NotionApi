package com.lucky.notionapi.util;

import com.lucky.notionapi.model.file.EmojiFile;
import com.lucky.notionapi.model.file.ExternalFile;
import com.lucky.notionapi.model.file.FileFile;

/**
 * 文件工具类
 *
 * @author jiahe
 */
public class FileUtils {

    /**
     * 创建一个表情文件对象
     *
     * @param emoji 表情
     * @return 表情文件对象
     */
    public static EmojiFile createEmojiFile(String emoji) {
        EmojiFile res = new EmojiFile(true);
        res.setEmoji(emoji);
        return res;
    }

    /**
     * 创建一个外部文件对象
     *
     * @param url 外部文件的url
     * @return 外部文件对象
     */
    public static ExternalFile createExternalFile(String url) {
        ExternalFile res = new ExternalFile(true);
        res.setExternal(new ExternalFile.External(url));
        return res;
    }

    /**
     * 创建一个Notion托管的文件文件对象
     *
     * @param url        Notion托管的文件url
     * @param expiryTime 文件过期时间(可以为空)
     * @return 文件文件对象
     */
    public static FileFile createFileFile(String url, String expiryTime) {
        FileFile res = new FileFile(true);
        res.setFile(new FileFile.File(url, expiryTime));
        return res;
    }

    /**
     * 创建一个Notion托管的文件文件对象
     *
     * @param url Notion托管的文件url
     * @return 文件文件对象
     */
    public static FileFile createFileFile(String url) {
        return createFileFile(url, null);
    }

}
