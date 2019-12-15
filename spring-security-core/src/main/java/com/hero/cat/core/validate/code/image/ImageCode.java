package com.hero.cat.core.validate.code.image;

import lombok.Data;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

@Data
public class ImageCode {

    private BufferedImage image;
    private String code;
    private LocalDateTime expiredTime;

    public ImageCode(BufferedImage image, String code, LocalDateTime expiredTime) {
        this.image = image;
        this.code = code;
        this.expiredTime = expiredTime;
    }

    public ImageCode(BufferedImage image,String code, int expireInt){
        this.image = image;
        this.code=code;
        expiredTime=LocalDateTime.now().plusSeconds(expireInt);
    }
}
