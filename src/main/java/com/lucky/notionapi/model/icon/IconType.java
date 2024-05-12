package com.lucky.notionapi.model.icon;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * 代表图标的表情符号或文件对象。
 * @author 贺佳
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION, property = "type")
public interface IconType {

    String FILE = "file";

    String EMOJI = "emoji";

}
