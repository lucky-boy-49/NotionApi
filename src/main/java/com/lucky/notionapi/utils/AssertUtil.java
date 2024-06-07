package com.lucky.notionapi.utils;

import com.lucky.notionapi.exception.CreateEntityException;
import org.springframework.util.StringUtils;

/**
 * 断言根据
 *
 * @author jiahe
 */
public class AssertUtil {

    /**
     * 断言不为空，否则抱错
     *
     * @param str     待检查字符串
     * @param message 错误信息
     */
    public static void isNotNull(String str, String message) {
        if (!StringUtils.hasText(str)) {
            throw new CreateEntityException(message);
        }
    }

    /**
     * 断言不为空，否则抱错
     *
     * @param num     待检查数字
     * @param message 错误信息
     */
    public static void isNotNull(Integer num, String message) {
        if (num == null) {
            throw new CreateEntityException(message);
        }
    }

}
