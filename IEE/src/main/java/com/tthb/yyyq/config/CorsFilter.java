package com.tthb.yyyq.config;

import cn.hutool.http.Method;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CorsFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Methods",
                "POST, GET, OPTIONS, DELETE");
        httpServletResponse.setHeader("Access-Control-Max-Age", "3600");
        httpServletResponse.setHeader("Access-Control-Allow-Headers",
                "Content-Type, x-requested-with, X-Custom-Header, Request-Ajax");//允许自定义的请求头
        if(httpServletRequest.getMethod().toUpperCase().equals(Method.OPTIONS.name())){
            return;
        }
        filterChain.doFilter(httpServletRequest, httpServletResponse);
    }


}
