package com.night.web.service.admin;

import com.night.persistence.dao.admin.IAdminDao;
import com.night.persistence.entity.AdminEntity;
import com.night.system.utils.encrypt.EncryptUtil;
import com.night.system.utils.other.StringUtil;
import com.night.web.Interaction.login.LoginForm;
import com.night.web.exception.ClientException;
import com.night.web.form.UpdatePasswordForm;
import com.night.web.service.base.BaseService;
import com.night.web.vo.Admin;
import com.sun.deploy.util.SessionState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/24.
 */
@Service
@Transactional
public class AdminService extends BaseService implements IAdminService{
    @Autowired
    IAdminDao dao;

    @Override
    public Admin login(LoginForm form) throws Exception {
        Admin admin = new Admin();
        String phone = form.getPhone();
        String password = form.getPassword();
        AdminEntity adminEntity = dao.findByPhoneNo(phone);
        if(adminEntity == null){
            throw new ClientException("phone_not_exist");
        }
        String decryptedPassword = EncryptUtil.decrypt(adminEntity.getPassword());
        if(!password.equals(decryptedPassword)){
            throw new ClientException("password_error");
        }
        admin.setAdminEntity(adminEntity);
        admin.setLoginTime(new SimpleDateFormat("yyyy.MM.dd HH:mm").format(adminEntity.getLoginTime()));
        adminEntity.setLoginTime(new Timestamp(new Date().getTime()));
        dao.save(adminEntity);
        return admin;
    }

    /**
     * 更新用户密码
     * @param admin
     * @param form
     * @throws Exception
     */
    @Override
    public void update(Admin admin, UpdatePasswordForm form) throws Exception {
        String password = EncryptUtil.decrypt(admin.getAdminEntity().getPassword());
        if(!password.equals(form.getOldPassword())){
            throw new ClientException("old_password_error");
        }
        if(StringUtil.isNone(form.getNewPassword())){
            throw new ClientException("new_password_none");
        }
        if(!form.getNewPassword().equals(form.getRenewPassword())){
            throw new ClientException("renew_password_diffrent");
        }
        AdminEntity ae = admin.getAdminEntity();
        ae.setPassword(EncryptUtil.encrypt(form.getNewPassword()));
        dao.save(ae);
    }
}
