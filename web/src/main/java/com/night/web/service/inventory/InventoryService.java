package com.night.web.service.inventory;

import com.night.persistence.dao.inventory.IInventoryDao;
import com.night.web.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/8/24.
 */
@Service
@Transactional
public class InventoryService extends BaseService implements IInventoryService {
    @Autowired
    IInventoryDao dao;




}
