package com.night.web.service.store;

import com.night.persistence.dao.store.IStoreDao;
import com.night.web.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/8/24.
 */
@Service
@Transactional
public class StoreService extends BaseService implements IStoreService {
    @Autowired
    IStoreDao dao;

}
