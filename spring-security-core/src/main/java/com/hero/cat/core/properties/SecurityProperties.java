package com.hero.cat.core.properties;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cat.security")
@Data
public class SecurityProperties {

    private  BrowserProperties browser = new BrowserProperties();


}
