package com.gmail.apachdima.desirejob.commonservice.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Model {

    BOOK("Book"),
    USER("User"),
    ROLE("Role");

    private final String name;

    @AllArgsConstructor
    @Getter
    public enum Field {

        ID("id"),
        USER_NAME("username"),
        NAME("name");

        private final String fieldName;
    }
}
