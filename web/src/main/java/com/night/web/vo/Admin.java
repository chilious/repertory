package com.night.web.vo;

import com.night.persistence.entity.AdminEntity;

/**
 * Created by Administrator on 2017/8/25.
 */
public class Admin{
    private AdminEntity adminEntity;

    private String loginTime;

    public AdminEntity getAdminEntity() {
        return adminEntity;
    }

    public void setAdminEntity(AdminEntity adminEntity) {
        this.adminEntity = adminEntity;
    }

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }
}
