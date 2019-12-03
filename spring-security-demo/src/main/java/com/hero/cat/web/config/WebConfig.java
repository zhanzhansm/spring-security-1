package com.hero.cat.web.config;

import com.hero.cat.web.filter.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @SuppressWarnings("unused")
    @Autowired
    private com.hero.cat.web.Interceptor.MyInterceptor myInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(myInterceptor);
    }


    @Bean
    public FilterRegistrationBean rigistFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();

        MyFilter timeFilter = new MyFilter();
        filterRegistrationBean.setFilter(timeFilter);
        return  filterRegistrationBean;
    }



}
