package com.hero.cat.browser;

import lombok.Data;

@Data
public class SimpleResponse {

    private Object object;

    public SimpleResponse(Object object) {
        this.object = object;
    }
}
