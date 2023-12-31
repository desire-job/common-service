package com.gmail.apachdima.desirejob.commonservice.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommonConstant {

    COMMON_MESSAGE_SOURCE_PATH("classpath:messages/common_messages"),
    BOOK_SERVICE_MESSAGE_SOURCE_PATH("classpath:messages/book_service_messages"),
    USER_SERVICE_MESSAGE_SOURCE_PATH("classpath:messages/user_service_messages"),
    AUTH_HEADER("Authorization"),
    BASIC_AUTH_HEADER_PREFIX("Basic "),
    COLON(":"),
    DOT("."),
    EQUAL("="),
    COMMA(","),
    SPACE(" "),
    EMPTY("");

    private final String value;
}
