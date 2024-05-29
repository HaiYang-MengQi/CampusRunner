package com.haiyang.campusrunner.interceptor;

import com.haiyang.campusrunner.utils.JWTUtils;
import com.haiyang.campusrunner.utils.ThreadLocalUtils;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器");
        String token = request.getHeader("token");
        try{
            Map<String, Object> map = JWTUtils.parseToken(token);
            ThreadLocalUtils.set(map);
            return true;
        }catch (Exception e){
            System.out.println("token解析失败");
            response.setStatus(555);
            return false;

        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        ThreadLocalUtils.remove();
    }
}
