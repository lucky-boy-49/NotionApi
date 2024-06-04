package com.lucky.notionapi.model.database.filter.multiple;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucky.notionapi.model.database.filter.DatabaseFilter;
import lombok.Data;

/**
 * 或者连接器
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrMultiple implements Multiple {

    private DatabaseFilter[] or;

}
