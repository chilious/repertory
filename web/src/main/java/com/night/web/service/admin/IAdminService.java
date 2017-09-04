package com.night.web.service.admin;

import com.night.web.Interaction.login.LoginForm;
import com.night.web.form.UpdatePasswordForm;
import com.night.web.service.base.IBaseService;
import com.night.web.vo.Admin;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface IAdminService extends IBaseService{
    public Admin login(LoginForm form)throws Exception;

    public void update(Admin admin, UpdatePasswordForm form)throws Exception;
}
