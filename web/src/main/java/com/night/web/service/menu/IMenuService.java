package com.night.web.service.menu;

import com.night.web.service.base.IBaseService;
import com.night.web.vo.Admin;
import com.night.web.vo.Menu;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface IMenuService extends IBaseService {

    /**
     * 获取所有菜单
     * @return
     * @throws Exception
     */
    public List<Menu> getMenuList(Integer roleid)throws Exception;
}
