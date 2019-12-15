package com.hero.cat.core.validate.code;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.social.connect.web.HttpSessionSessionStrategy;
import org.springframework.social.connect.web.SessionStrategy;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Data
public class ValidateCodeFilter extends OncePerRequestFilter {

    SessionStrategy sessionStrategy= new HttpSessionSessionStrategy();

    @Autowired
    private AuthenticationFailureHandler authenticationFailureHandler;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
       try{
           if("/authentication/form".equals(request.getRequestURI())){
               validate(new ServletWebRequest(request));
           }
       }catch (ValidateCodeException e){
           authenticationFailureHandler.onAuthenticationFailure(request,response,e);
           return;
       }

        filterChain.doFilter(request, response);

    }

    private void validate(ServletWebRequest request) throws ServletRequestBindingException {
        String imageCode = ServletRequestUtils.getStringParameter(request.getRequest(), "imageCode");
        if(StringUtils.isEmpty(imageCode)){
            throw new ValidateCodeException("验证码不能为空");
        }

    }
}
