package com.night.web.service.menu;

import com.night.persistence.dao.menu.IMenuDao;
import com.night.persistence.entity.MenuEntity;
import com.night.web.service.base.BaseService;
import com.night.web.vo.Admin;
import com.night.web.vo.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
@Service
@Transactional
public class MenuService extends BaseService implements IMenuService{
    @Autowired
    IMenuDao dao;

    @Override
    public List<Menu> getMenuList(Integer roleid) throws Exception {
        List<Menu> menuList = new ArrayList<Menu>();
        List<MenuEntity> list = dao.findMenuListByRoleID(roleid);

        for(MenuEntity temp : list){
            if(temp.getNo().length() == 2){
                Menu menu = new Menu();
                menu.setMenuEntity(temp);
                List<Menu> subList = new ArrayList<Menu>();
                for(MenuEntity sub : list){
                    if(sub.getNo().startsWith(temp.getNo()) && sub.getNo().length() == 4){
                        Menu subm = new Menu();
                        subm.setMenuEntity(sub);
                        subList.add(subm);
                    }
                }
                menu.setSubMenuList(subList);
                menuList.add(menu);
            }
        }

        return menuList;
    }
}
