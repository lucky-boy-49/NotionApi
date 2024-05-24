package com.lucky.notionapi.enumerate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 汇总方法枚举
 *
 * @author jiahe
 */
@Getter
@RequiredArgsConstructor
public enum RollupFunction {

    COUNT("count"),
    COUNT_VALUES("count_values"),
    EMPTY("empty"),
    NOT_EMPTY("not_empty "),
    UNIQUE("unique"),
    SHOW_UNIQUE("show_unique"),
    PERCENT_EMPTY("percent_empty"),
    PERCENT_NOT_EMPTY("percent_not_empty"),
    SUM("sum"),
    AVERAGE("average"),
    MEDIAN("median"),
    MIN("min"),
    MAX("max"),
    RANGE("range"),
    EARLIEST_DATE("earliest_date"),
    LATEST_DATE("latest_date"),
    DATE_RANGE("date_range"),
    CHECKED("checked"),
    UNCHECKED("unchecked"),
    PERCENT_CHECKED("percent_checked"),
    PERCENT_UNCHECKED("percent_unchecked"),
    COUNT_PER_GROUP("count_per_group"),
    PERCENT_PER_GROUP("percent_per_group"),
    SHOW_ORIGINAL("show_original");

    private final String type;

}
