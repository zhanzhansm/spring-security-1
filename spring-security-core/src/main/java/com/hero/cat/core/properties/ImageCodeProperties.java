package com.hero.cat.core.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class ImageCodeProperties {

    private int codeLength = 4;
    private int width = 67;
    private int height = 32;

    public int getCodeLength() {
        return codeLength;
    }

    public void setCodeLength(int codeLength) {
        this.codeLength = codeLength;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
