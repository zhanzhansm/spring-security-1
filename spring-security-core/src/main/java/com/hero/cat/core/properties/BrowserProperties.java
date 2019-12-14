package com.hero.cat.core.properties;

import lombok.Data;

@Data
public class BrowserProperties {

    private String  loginPage ="/cat-signIn.html";

    private LoginResponseType loginType = LoginResponseType.JSON;




}
