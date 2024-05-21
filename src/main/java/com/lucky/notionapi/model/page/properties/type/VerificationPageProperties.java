package com.lucky.notionapi.model.page.properties.type;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.lucky.notionapi.model.page.properties.AbstractPageProperties;
import com.lucky.notionapi.model.user.User;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 认证<br>
 * 数据库中页面的验证状态。页面可以经过验证或未经验证，并且验证可以设置可选的到期日期。<br>
 * 目前无法通过公共 API 设置或更新验证状态。
 *
 * @author jiahe
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerificationPageProperties extends AbstractPageProperties {

    private Verification verification;

    @Data
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public static class Verification {

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
        private ObjectNode date;

    }

}
