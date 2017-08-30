package com.night.web.interceptor;

import com.night.system.utils.other.NetUtil;

import com.night.web.vo.Admin;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/8/25.
 */
public class LoginInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Admin admin = (Admin)request.getSession().getAttribute("storeAdmin");
        //请求到登录页面 放行
        if("/admin/login".equals(request.getServletPath()) || "/admin/login/check".equals(request.getServletPath())) {
            return true;
        }
        //登录验证
        if(admin != null){
            return true;
        }
        if(NetUtil.isAjax(request.getHeader("X-Requested-With"))){
            response.setHeader("sessionStatus", "timeout");
            return false;
        }
        response.sendRedirect(request.getContextPath() + "/admin/login");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
