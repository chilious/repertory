package com.night.web.service.role;

import com.night.persistence.dao.role.IRoleDao;
import com.night.web.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/8/24.
 */
@Service
@Transactional
public class RoleService extends BaseService implements IRoleService{
    @Autowired
    IRoleDao dao;
}
