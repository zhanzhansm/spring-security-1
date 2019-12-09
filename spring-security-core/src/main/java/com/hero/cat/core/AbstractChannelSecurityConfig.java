package com.hero.cat.core;

import com.hero.cat.core.properties.SecurityConstants;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;



public class AbstractChannelSecurityConfig extends WebSecurityConfigurerAdapter {


    protected void applyPasswordAuthenticationConfig(HttpSecurity http) throws Exception {
        http.formLogin().loginPage(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL)
                .loginProcessingUrl(SecurityConstants.DEFAULT_LOGIN_PROCESSING_URL_FORM);

    }


}
