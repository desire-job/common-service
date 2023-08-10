package com.gmail.apachdima.desirejob.commonservice.constant.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommonError {

    ENTITY_NOT_FOUND("error.entity.not.found"),
    ENTITY_CREATION_EXCEPTION("error.entity.created"),
    VALIDATION_REQUEST("error.validation.request"),
    MISSING_REQUEST_PARAMETER("error.missing.request.parameter"),
    DATA_ACCESS("error.data.access"),
    NO_HANDLER_FOUND("error.no.handler.found"),
    HTTP_METHOD_NOT_ALLOWED("error.http.method.not.allowed"),
    MEDIA_TYPE_NOT_SUPPORTED("error.media.type.not.supported"),
    INTERNAL_SERVER_ERROR_OCCURRED("error.internal.server.error.occurred"),
    AUTH_SERVER_SIGN_OUT("error.auth-server.sign-out"),
    LOG_CONTROLLER_EXECUTE("error.log.controller.execute");

    private final String key;
}
