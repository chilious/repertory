package com.night.web.vo;

import com.night.persistence.entity.MenuEntity;

import java.util.List;

/**
 * Created by Administrator on 2017/8/30.
 */
public class Menu {
    private MenuEntity menuEntity;
    private List<Menu> subMenuList;

    public MenuEntity getMenuEntity() {
        return menuEntity;
    }

    public void setMenuEntity(MenuEntity menuEntity) {
        this.menuEntity = menuEntity;
    }

    public List<Menu> getSubMenuList() {
        return subMenuList;
    }

    public void setSubMenuList(List<Menu> subMenuList) {
        this.subMenuList = subMenuList;
    }
}
