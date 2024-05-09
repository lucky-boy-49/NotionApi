package com.lucky.notionapi.enumerate;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Notion 请求错误代码枚举
 * @author jiahe
 */
@Getter
@RequiredArgsConstructor
public enum ErrorCodes {

    /**
     * 请求正文无法解码为 JSON。
     */
    INVALID_JSON(400, "invalid_json", "解析 JSON 正文时出错"),
    /**
     * 请求 URL 无效。
     */
    INVALID_REQUEST_URL(400, "invalid_request_url", "请求 URL 无效"),
    /**
     * 不支持此请求。
     */
    INVALID_REQUEST(400, "invalid_request", "请求不受支持"),
    /**
     * 提供的授权授予（例如，授权代码、资源所有者凭证）或刷新令牌无效、过期、已撤销、与授权请求中使用的重定向 URI 不匹配，或者已颁发给另一个客户端。
     */
    INVALID_GRANT(400, "invalid_grant", "无效的授权码"),
    /**
     * 请求正文与预期参数的架构不匹配。
     */
    VALIDATION_ERROR(400, "validation_error", "参数验证失败"),
    /**
     * 该请求缺少必需的 Notion-Version 标头。
     */
    MISSING_VERSION(400, "missing_version", "缺少版本号"),
    /**
     * 不记名令牌无效。
     */
    UNAUTHORIZED(401, "unauthorized", "未授权"),
    /**
     * 鉴于所使用的不记名令牌，客户端无权执行此操作。
     */
    RESTRICTED_RESOURCE(403, "restricted_resource", "鉴于所使用的不记名令牌，客户端无权执行此操作"),
    /**
     * 鉴于所使用的不记名令牌，该资源不存在。此错误还可能表明资源尚未与不记名令牌的所有者共享。
     */
    OBJECT_NOT_FOUND(404, "object_not_found", "鉴于所使用的不记名令牌，该资源不存在。此错误还可能表明资源尚" +
            "未与不记名令牌的所有者共享"),
    /**
     * 交易无法完成，可能是由于数据冲突。确保参数是最新的，然后重试。
     */
    CONFLICT_ERROR(409, "conflict_error", "交易无法完成，可能是由于数据冲突。确保参数是最新的，然后重试"),
    /**
     * 此请求超出了允许的请求数。放慢速度，再试一次。
     */
    RATE_LIMITED(429, "rate_limited", "此请求超出了允许的请求数。放慢速度，再试一次。有关速率限制的更多详细信息"),
    /**
     * 一个意料之外的问题发生了。
     */
    INTERNAL_SERVER_ERROR(500, "internal_server_error", "Notion 服务器内部错误"),
    /**
     * Notion 在尝试完成此请求时遇到问题（例如，无法与上游服务器建立连接）。请再试一次。
     */
    BAD_GATEWAY(502, "bad_gateway", "Notion 服务器无法访问"),
    /**
     * 概念不可用。当响应请求的时间超过 60 秒（最大请求超时）时，就会发生这种情况。请稍后再试。
     */
    SERVICE_UNAVAILABLE(503, "service_unavailable", "Notion不可用。当响应请求的时间超过 60 秒（最大请求" +
            "超时）时，就会发生这种情况。请稍后再试"),
    /**
     * Notion的数据库不可用或者不处于可查询的状态。请稍后再试。
     */
    DATABASE_CONNECTION_UNAVAILABLE(503, "database_connection_unavailable", "Notion的数据库不可用或者" +
            "不处于可查询的状态。请稍后再试"),
    /**
     * 尝试完成此请求时，Notion 超时。请稍后再试。
     */
    GATEWAY_TIMEOUT(504, "gateway_timeout", "Notion 服务器超时");

    /**
     * Http状态码
     */
    private final int statusCode;

    /**
     * 响应码
     */
    private final String code;

    /**
     * 响应消息
     */
    private final String message;

}
