package com.night.web.service.stock;

import com.night.persistence.dao.stock.IStockDao;
import com.night.web.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by Administrator on 2017/8/24.
 */
@Service
@Transactional
public class StockService extends BaseService implements IStockService{
    @Autowired
    IStockDao dao;
}
