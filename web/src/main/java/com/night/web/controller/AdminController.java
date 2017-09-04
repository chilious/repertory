package com.night.web.controller;

import com.night.web.Interaction.ClientJson;
import com.night.web.Interaction.login.LoginForm;
import com.night.web.exception.ClientException;
import com.night.web.form.UpdatePasswordForm;
import com.night.web.service.admin.IAdminService;
import com.night.web.service.menu.IMenuService;
import com.night.web.vo.Admin;
import com.night.web.vo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
@Controller
@RequestMapping(value = "/admin")
@ResponseBody
public class AdminController {
    @Autowired
    IAdminService service;
    @Autowired
    IMenuService menuService;
    @Autowired
    HttpServletRequest req;

    /**
     * 跳转到登录页
     * @return
     */
    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public ModelAndView gotoLogin()throws Exception{
        return new ModelAndView("login/login");
    }

    /**
     * 登陆方法
     * @param form
     * @return
     */

    @RequestMapping(value = "/login/check" , method = RequestMethod.GET)
    public ClientJson login(LoginForm form){
        ClientJson json = new ClientJson();
        try{
            Admin admin = service.login(form);
            if(admin != null)
                req.getSession().setAttribute("storeAdmin",admin);
        }catch(Exception e){
            json.setSuccess(false);
            if(e instanceof ClientException){
                json.setErrorMsg(e.getMessage());
            }else{
                e.printStackTrace();
                json.setErrorMsg("common_ajax_error");
            }
        }finally{
            return json;
        }
    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping(value = "/exit" , method = RequestMethod.GET)
    public ModelAndView exit()throws Exception{
        req.getSession().removeAttribute("storeAdmin");
        ModelAndView mav = new ModelAndView("/login/login");
        return mav;
    }

    /**
     * 跳转到主页
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/main")
    public ModelAndView gotoMain()throws Exception{
        ModelAndView mav = new ModelAndView("/main/main");
        Admin admin = (Admin) req.getSession().getAttribute("storeAdmin");
        List<Menu> menuList = menuService.getMenuList(admin.getAdminEntity().getRoleId());
        mav.addObject("menuList",menuList);
        return mav;
    }

    /**
     * 跳转到修改密码页面
     * @return
     */
    @RequestMapping(value = "/password" , method = RequestMethod.GET)
    public ModelAndView gotoUpdatePassword()throws Exception{
        return new ModelAndView("password/update");
    }

    /**
     * 更新密码
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/password" , method = RequestMethod.PUT)
    public ClientJson updatePassword(UpdatePasswordForm form)throws Exception{
        ClientJson json = new ClientJson();
        try{
            Admin admin = (Admin) req.getSession().getAttribute("storeAdmin");
            service.update(admin,form);
        }catch(Exception e){
            json.setSuccess(false);
            if(e instanceof ClientException){
                json.setErrorMsg(e.getMessage());
            }else{
                e.printStackTrace();
                json.setErrorMsg("common_ajax_error");
            }
        }finally{
            return json;
        }
    }
}
