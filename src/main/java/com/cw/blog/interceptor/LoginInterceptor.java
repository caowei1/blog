package com.cw.blog.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Handler;

//拦截器
public class LoginInterceptor implements HandlerInterceptor {
//    public boolean preHandle(HttpServletRequest request,
//                             HttpServletResponse response,
//                             Object handler) throws Exception {
//        if(request.getSession().getAttribute("user") == null){
//            response.sendRedirect("/admin");
//            return false;
//        }
//
//        return true;
//    }
}
