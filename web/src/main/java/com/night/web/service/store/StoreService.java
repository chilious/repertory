package com.night.web.service.store;

import com.night.persistence.dao.store.IStoreDao;
import com.night.persistence.entity.StoreEntity;
import com.night.web.service.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
@Service
@Transactional
public class StoreService extends BaseService implements IStoreService {
    @Autowired
    IStoreDao dao;

    @Override
    public StoreEntity getStoreByAdminID(Integer adminID) throws Exception {
        return dao.findStoreByAdminID(adminID);
    }

    @Override
    public Integer getPurchaseCount(Integer storeID) throws Exception {
        return dao.findPurchaseCountByStoreID(storeID);
    }

    @Override
    public BigDecimal getMaterialMoney(Integer storeID) throws Exception{
        return dao.findMaterialMoneyByStoreID(storeID);
    }

    @Override
    public Integer getOutCountSuccess(Integer storeID) throws Exception{
        return dao.findOutCountSuccessByStoreID(storeID);
    }

    @Override
    public Integer getOutCountFail(Integer storeID) throws Exception{
        return dao.findOutCountFailByStoreID(storeID);
    }

    @Override
    public Integer getInCountSuccess(Integer storeID) throws Exception{
        return dao.findInCountSuccessByStoreID(storeID);
    }

    @Override
    public Integer getInCountFail(Integer storeID) throws Exception{
        return dao.findInCountFailByStoreID(storeID);
    }

    @Override
    public BigDecimal getExpressMoney(Integer storeID) throws Exception{
        return dao.findExpressMoneyByStoreID(storeID);
    }

    @Override
    public HashMap<String, Double> getInMaterial(Integer storeID) throws Exception{
        List list = dao.findInMaterialByStoreID(storeID);
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(list.get(i).getClass().getName()+"------------------");
        }
        return null;
    }

    @Override
    public HashMap<String, Double> getOutMaterial(Integer storeID) throws Exception{
        List list = dao.findOutMaterialByStoreID(storeID);
        return null;
    }

    @Override
    public HashMap<String, Double> getLossMaterial(Integer storeID) throws Exception{
        List list = dao.findLossMaterialByStoreID(storeID);
        return null;
    }

    @Override
    public HashMap<String, Double> getNowMaterial(Integer storeID) throws Exception{
        List list = dao.findNowMaterialByStoreID(storeID);
        return null;
    }


}
