package com.night.web.service.store;

import com.night.persistence.entity.StoreEntity;
import com.night.web.service.base.IBaseService;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface IStoreService extends IBaseService {

    StoreEntity getStoreByAdminID(Integer storeID)throws Exception;

    Integer getPurchaseCount(Integer storeID)throws Exception;

    BigDecimal getMaterialMoney(Integer storeID)throws Exception;

    Integer getOutCountSuccess(Integer storeID)throws Exception;

    Integer getOutCountFail(Integer storeID)throws Exception;

    Integer getInCountSuccess(Integer storeID)throws Exception;

    Integer getInCountFail(Integer storeID)throws Exception;

    BigDecimal getExpressMoney(Integer storeID)throws Exception;

    HashMap<String,Double> getInMaterial(Integer storeID)throws Exception;

    HashMap<String,Double> getOutMaterial(Integer storeID)throws Exception;

    HashMap<String,Double> getLossMaterial(Integer storeID)throws Exception;

    HashMap<String,Double> getNowMaterial(Integer storeID)throws Exception;
}
