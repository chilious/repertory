package com.night.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/8/24.
 */
@Controller
@RequestMapping(value = "/")
public class RootController {
    /**
     * 跳转到主页
     * @return
     * @throws Exception
     */
    @RequestMapping(method = RequestMethod.GET)
    public String gotoMain()throws Exception{
        return "main/main";
    }
}
