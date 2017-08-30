package com.night.persistence.dao.menu;

import com.night.persistence.dao.base.BaseDao;
import com.night.persistence.entity.MenuEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
@Repository
public class MenuDao extends BaseDao implements IMenuDao {
    @Override
    public List<MenuEntity> findMenuListByRoleID(Integer roleid) throws Exception {
        String queryString = "select m FROM MenuEntity m,RefRoleMenuEntity r WHERE m.no = r.menuNo AND r.roleId = ?";
        List<MenuEntity> list = (List<MenuEntity>) ht.find(queryString,roleid);
        return list;
    }
}
