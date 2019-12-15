package com.hero.cat.core.validate.code;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ValidateCode {

    private String code;
    private LocalDateTime expiredTime;

    public ValidateCode(String code, LocalDateTime expiredTime) {
        this.code = code;
        this.expiredTime = expiredTime;
    }

    public ValidateCode(String code, int expireInt){
        this.code=code;
        expiredTime=LocalDateTime.now().plusSeconds(expireInt);
    }
}
