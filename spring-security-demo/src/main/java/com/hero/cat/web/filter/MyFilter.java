package com.hero.cat.web.filter;

import javax.servlet.*;
import java.io.IOException;


public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter  ----> init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter  ----> begin");
        chain.doFilter(request,response);
        System.out.println("filter  ----> end");
    }

    @Override
    public void destroy() {
        System.out.println("filter  ----> destroy");

    }
}
