package com.night.persistence.dao.menu;

import com.night.persistence.dao.base.IBaseDao;
import com.night.persistence.entity.MenuEntity;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface IMenuDao extends IBaseDao{
    /**
     * 根据角色ID获取根菜单列表
     * @param roleid
     * @return
     * @throws Exception
     */
    public List<MenuEntity> findMenuListByRoleID(Integer roleid)throws Exception;
}
