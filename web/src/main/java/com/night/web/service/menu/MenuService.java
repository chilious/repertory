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
            Menu menu = new Menu();
            menu.setMenuEntity(temp);
            menuList.add(menu);
        }

        List<Menu> returnList = new ArrayList<Menu>();
        for(Menu m : menuList){
            if(m.getMenuEntity().getNo().length() == 2){
                returnList.add(m);
            }
        }
        for(Menu M : returnList){
            List<Menu> subList = new ArrayList<Menu>();
            String NO = M.getMenuEntity().getNo();
            for(Menu m : menuList){
                String no = m.getMenuEntity().getNo();
                if(no.length() == 4 && no.startsWith(NO)){
                    subList.add(m);
                }
            }
            M.setSubMenuList(subList);
        }
        return returnList;
    }
}
