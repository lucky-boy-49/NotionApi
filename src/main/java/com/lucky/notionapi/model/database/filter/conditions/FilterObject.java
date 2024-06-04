package com.lucky.notionapi.model.database.filter.conditions;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.lucky.notionapi.model.database.filter.DatabaseFilter;

/**
 * 过滤器对象
 *
 * @author jiahe
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(value = CheckboxFilter.class),
        @JsonSubTypes.Type(value = DateFilter.class),
        @JsonSubTypes.Type(value = FilesFilter.class),
        @JsonSubTypes.Type(value = FormulaFilter.class),
        @JsonSubTypes.Type(value = MultiSelectFilter.class),
        @JsonSubTypes.Type(value = NumberFilter.class),
        @JsonSubTypes.Type(value = PeopleFilter.class),
        @JsonSubTypes.Type(value = RelationFilter.class),
        @JsonSubTypes.Type(value = RichTextFilter.class),
        @JsonSubTypes.Type(value = RollupFilter.class),
        @JsonSubTypes.Type(value = SelectFilter.class),
        @JsonSubTypes.Type(value = StatusFilter.class),
        @JsonSubTypes.Type(value = TimestampFilter.class),
        @JsonSubTypes.Type(value = IDFilter.class),
})
public interface FilterObject extends DatabaseFilter {

}
