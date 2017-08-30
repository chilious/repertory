package com.night.persistence.dao.admin;

import com.night.persistence.dao.base.IBaseDao;
import com.night.persistence.entity.AdminEntity;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface IAdminDao extends IBaseDao {
    /**
     * 根据手机号码找到仓库管理员
     * @param phoneNo
     * @return
     * @throws Exception
     */
    public AdminEntity findByPhoneNo(String phoneNo)throws Exception;
}
