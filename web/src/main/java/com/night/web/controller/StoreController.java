package com.night.web.controller;

import com.night.web.service.store.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/8/24.
 */
@Controller
@RequestMapping(value = "/store")
public class StoreController {
    @Autowired
    IStoreService service;

    /**
     * 跳转到我的仓库
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/mystore" , method = RequestMethod.GET)
    public ModelAndView gotoMyStore()throws Exception{
        return new ModelAndView("mystore/mystore");
    }
}
