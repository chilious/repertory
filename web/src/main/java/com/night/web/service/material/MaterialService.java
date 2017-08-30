package com.night.web.service.material;

import com.night.persistence.dao.material.IMaterialDao;
import com.night.web.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/8/24.
 */
@Service
@Transactional
public class MaterialService extends BaseService implements IMaterailService{
    @Autowired
    IMaterialDao dao;
}
