package com.hero.cat.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
public class BrowserProperties {

    private String  loginPage ="/cat-signIn.html";
}
