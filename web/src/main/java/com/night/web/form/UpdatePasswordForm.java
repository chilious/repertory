package com.night.web.form;

/**
 * Created by Administrator on 2017/9/4.
 * 更新密码表单
 */
public class UpdatePasswordForm {
    private String oldPassword;
    private String newPassword;
    private String renewPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getRenewPassword() {
        return renewPassword;
    }

    public void setRenewPassword(String renewPassword) {
        this.renewPassword = renewPassword;
    }
}
