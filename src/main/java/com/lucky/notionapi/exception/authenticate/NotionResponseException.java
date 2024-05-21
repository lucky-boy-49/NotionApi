package com.lucky.notionapi.exception.authenticate;

import com.lucky.notionapi.dao.ErrorDao;
import com.lucky.notionapi.enumerate.ErrorCodes;
import lombok.Getter;

/**
 * 异常
 *
 * @author jiahe
 */
@Getter
public class NotionResponseException extends RuntimeException {

    private final Integer statusCode;

    private final ErrorCodes error;

    public NotionResponseException(Integer statusCode, ErrorDao errorDao) {
        super(errorDao.getMessage());
        this.statusCode = statusCode;
        switch (errorDao.getCode()) {
            case "invalid_json":
                this.error = ErrorCodes.INVALID_JSON;
                break;
            case "invalid_request_url":
                this.error = ErrorCodes.INVALID_REQUEST_URL;
                break;
            case "invalid_request":
                this.error = ErrorCodes.INVALID_REQUEST;
                break;
            case "invalid_grant":
                this.error = ErrorCodes.INVALID_GRANT;
                break;
            case "validation_error":
                this.error = ErrorCodes.VALIDATION_ERROR;
                break;
            case "unauthorized":
                this.error = ErrorCodes.UNAUTHORIZED;
                break;
            case "restricted_resource":
                this.error = ErrorCodes.RESTRICTED_RESOURCE;
                break;
            case "object_not_found":
                this.error = ErrorCodes.OBJECT_NOT_FOUND;
                break;
            case "conflict_error":
                this.error = ErrorCodes.CONFLICT_ERROR;
                break;
            case "rate_limited":
                this.error = ErrorCodes.RATE_LIMITED;
                break;
            case "internal_server_error":
                this.error = ErrorCodes.INTERNAL_SERVER_ERROR;
                break;
            case "bad_gateway":
                this.error = ErrorCodes.BAD_GATEWAY;
                break;
            case "service_unavailable":
                this.error = ErrorCodes.SERVICE_UNAVAILABLE;
                break;
            case "database_connection_unavailable":
                this.error = ErrorCodes.DATABASE_CONNECTION_UNAVAILABLE;
                break;
            case "gateway_timeout":
                this.error = ErrorCodes.GATEWAY_TIMEOUT;
                break;
            default:
                this.error = ErrorCodes.UNKNOWN;
                break;
        }
    }
}
