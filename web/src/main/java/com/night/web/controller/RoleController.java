package com.night.web.controller;

import com.night.web.service.role.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/8/24.
 */
@Controller
@RequestMapping(value = "/role")
public class RoleController {
    @Autowired
    IRoleService service;
}
