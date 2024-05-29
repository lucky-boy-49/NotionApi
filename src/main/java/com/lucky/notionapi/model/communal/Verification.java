package com.lucky.notionapi.model.communal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lucky.notionapi.model.user.User;
import lombok.Data;

/**
 * 认证
 *
 * @author jiahe
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Verification {

    /**
     * 页面的验证状态。
     */
    private String state;

    /**
     * 如果页面经过验证，将包含一个 User 对象来指示验证该页面的用户。
     */
    @JsonProperty("verified_by")
    private User verifiedBy;

    /**
     * 如果页面已验证，则日期对象将包含验证开始的日期 ( start )。<br>
     * 如果为验证设置了到期日期，则会包含结束日期 ( end )。 （ISO 8601 日期和时间。）
     */
    private Date date;

}
