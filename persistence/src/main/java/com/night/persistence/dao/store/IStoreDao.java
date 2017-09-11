package com.night.persistence.dao.store;

import com.night.persistence.dao.base.IBaseDao;
import com.night.persistence.entity.StoreEntity;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
public interface IStoreDao extends IBaseDao {

    StoreEntity findStoreByAdminID(int id)throws Exception;

    Integer findPurchaseCountByStoreID(Integer storeID)throws Exception;

    BigDecimal findMaterialMoneyByStoreID(Integer storeID)throws Exception;

    Integer findOutCountSuccessByStoreID(Integer storeID)throws Exception;

    Integer findOutCountFailByStoreID(Integer storeID)throws Exception;

    Integer findInCountSuccessByStoreID(Integer storeID)throws Exception;

    Integer findInCountFailByStoreID(Integer storeID)throws Exception;

    BigDecimal findExpressMoneyByStoreID(Integer storeID)throws Exception;

    List findInMaterialByStoreID(Integer storeID)throws Exception;

    List findOutMaterialByStoreID(Integer storeID)throws Exception;

    List findLossMaterialByStoreID(Integer storeID)throws Exception;

    List findNowMaterialByStoreID(Integer storeID)throws Exception;
}
