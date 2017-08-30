package com.night.persistence.dao.admin;

import com.night.persistence.dao.base.BaseDao;
import com.night.persistence.entity.AdminEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
@Repository
public class AdminDao extends BaseDao implements IAdminDao {
    @Override
    public AdminEntity findByPhoneNo(String phoneNo) throws Exception {
        List<AdminEntity> list = (List<AdminEntity>)ht.find("from AdminEntity where phone = ?",phoneNo);
        if(list == null || list.size() == 0)
            return null;
        return list.get(0);
    }
}
