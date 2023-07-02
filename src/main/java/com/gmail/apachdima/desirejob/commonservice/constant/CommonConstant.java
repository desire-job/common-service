package com.gmail.apachdima.desirejob.commonservice.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommonConstant {

    MESSAGE_SOURCE_PATH("classpath:messages/messages"),
    AUTH_HEADER("Authorization"),
    BASIC_AUTH_HEADER_PREFIX("Basic "),
    COLON(":"),
    DOT("."),
    EQUAL("="),
    COMMA(",");

    private final String value;
}
