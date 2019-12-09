package com.hero.cat.browser;


import com.hero.cat.core.properties.SecurityConstants;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class BrowserSecurityController {

//    @RequestMapping(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL)
//    @ResponseStatus(HttpStatus.UNAUTHORIZED)
//    public String requireAuthentication(HttpServletRequest request, HttpServletResponse response){
//
//        return "";
//
//    }

    @RequestMapping(SecurityConstants.DEFAULT_UNAUTHENTICATION_URL)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public String requireAuthentication(HttpServletRequest request, HttpServletResponse response){

        return "";

    }


}
