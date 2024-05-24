package com.lucky.notionapi.enumerate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


/**
 * 颜色枚举
 * @author jiahe
 */
@Getter
@RequiredArgsConstructor
public enum Color {

    /**
     * 蓝色
     */
    BLUE("blue"),
    /**
     * 蓝色背景
     */
    BLUE_BACKGROUND("blue_background"),
    /**
     * 棕色
     */
    BROWN("brown"),
    /**
     * 棕色背景
     */
    BROWN_BACKGROUND("brown_background"),
    /**
     * 默认，即白色
     */
    DEFAULT("default"),
    /**
     * 灰色
     */
    GRAY("gray"),
    /**
     * 灰色背景
     */
    GRAY_BACKGROUND("gray_background"),
    /**
     * 绿色
     */
    GREEN("green"),
    /**
     * 绿色背景
     */
    GREEN_BACKGROUND("green_background"),
    /**
     * 橙色
     */
    ORANGE("orange"),
    /**
     * 橙色背景
     */
    ORANGE_BACKGROUND("orange_background"),
    /**
     * 黄色
     */
    YELLOW("yellow"),
    /**
     * 黄色背景
     */
    YELLOW_BACKGROUND("yellow_background"),
    /**
     * 粉色
     */
    PINK("pink"),
    /**
     * 粉色背景
     */
    PINK_BACKGROUND("pink_background"),
    /**
     * 紫色
     */
    PURPLE("purple"),
    /**
     * 紫色背景
     */
    PURPLE_BACKGROUND("purple_background"),
    /**
     * 红色
     */
    RED("red"),
    /**
     * 红色背景
     */
    RED_BACKGROUND("red_background");

    private final String color;

}
