package com.gmail.apachdima.desirejob.commonservice;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum CommonEntity {

    BOOK("Book"),
    USER("User");

    private final String name;

    @AllArgsConstructor
    @Getter
    public enum Field {

        ID("id"),
        USER_NAME("username");

        private final String fieldName;
    }
}
