package com.night.persistence.dao.store;

import com.night.persistence.dao.base.BaseDao;
import com.night.persistence.entity.StoreEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2017/8/24.
 */
@Repository
public class StoreDao extends BaseDao implements IStoreDao {

    @Override
    public StoreEntity findStoreByAdminID(int id) throws Exception {
        String sql = "select a from StoreEntity a,RefStoreAdminEntity b where a.id = b.storeId and b.adminId = ?";
        StoreEntity se = (StoreEntity) ht.find(sql,id);
        return se;
    }

    @Override
    public Integer findPurchaseCountByStoreID(Integer storeID) throws Exception {
        String sql = "select count(*) from ProcurementEntity WHERE storeId = ? ";
        return  (Integer)ht.iterate(sql,storeID).next();
    }

    @Override
    public BigDecimal findMaterialMoneyByStoreID(Integer storeID) throws Exception {
        String sql = "SELECT ifnull (SUM(a.productSpending),0) FROM StockEntity a,StockEntity b WHERE a.storeId = b.id AND a.status = 5 AND a.id = ?";
        return (BigDecimal) ht.iterate(sql,storeID).next();
    }

    @Override
    public Integer findOutCountSuccessByStoreID(Integer storeID) throws Exception {
        String sql = "SELECT COUNT(*) FROM StockEntity WHERE status = 3 and sourceStoreId = ? ";
        return (Integer) ht.iterate(sql,storeID).next();
    }

    @Override
    public Integer findOutCountFailByStoreID(Integer storeID) throws Exception {
        String sql = "SELECT COUNT(*) FROM StockEntity WHERE status = 2 and sourceStoreId = ? ";
        return (Integer) ht.iterate(sql,storeID).next();
    }

    @Override
    public Integer findInCountSuccessByStoreID(Integer storeID) throws Exception {
        String sql = "SELECT COUNT(*) FROM StockEntity WHERE status = 3 and storeId = ? ";
        return (Integer) ht.iterate(sql,storeID).next();
    }

    @Override
    public Integer findInCountFailByStoreID(Integer storeID) throws Exception {
        String sql = "SELECT COUNT(*) FROM StockEntity WHERE status = 2 and storeId = ? ";
        return (Integer) ht.iterate(sql,storeID).next();
    }

    @Override
    public BigDecimal findExpressMoneyByStoreID(Integer storeID) throws Exception {
        String sql = "SELECT IFNULL (SUM(expressSpending),0) FROM StockEntity WHERE storeId = ? AND expressPayer = 0";
        return (BigDecimal) ht.iterate(sql,storeID).next();
    }

    @Override
    public List findInMaterialByStoreID(Integer storeID) throws Exception {
        String sql = "SELECT material.name ,CONCAT(SUM(number),material.unit) "
        +"FROM RefStockMaterialEntity ref,StockEntity stock,MaterialEntity material "
        +"WHERE ref.stockId = stock.id AND ref.materialId = material.id and stock.storeId = ? "
        +"and stock.status = 3 GROUP BY material.name";
        return ht.find(sql,storeID);
    }

    @Override
    public List findOutMaterialByStoreID(Integer storeID) throws Exception {
        String sql = "SELECT material.name ,CONCAT(SUM(number),material.unit) "
        +"FROM RefStockMaterialEntity ref,StockEntity stock,MaterialEntity material "
        +"WHERE ref.stockId = stock.id AND ref.materialId = material.id and stock.sourceStoreId = ? "
        +"and stock.status = 3 GROUP BY material.name";
        return ht.find(sql,storeID);
    }

    @Override
    public List findLossMaterialByStoreID(Integer storeID) throws Exception {
        String sql = "SELECT material.name,CONCAT(ABS(SUM(ref.difference)),material.unit) "
                +"FROM RefCheckpointMaterialEntity ref,CheckpointEntity checkpoint,MaterialEntity material "
                +"WHERE ref.checkpointId = checkpoint.id AND ref.materialId = material.id "
                +" AND checkpoint.storeId = ? GROUP BY material.name";
        return ht.find(sql,storeID);
    }

    @Override
    public List findNowMaterialByStoreID(Integer storeID) throws Exception {
        String sql = "SELECT material.name,CONCAT(SUM(inventory.number),material.unit) "
                +"FROM InventoryEntity inventory, MaterialEntity material "
                +"WHERE inventory.storeId = ? AND inventory.materialId = material.id "
                +"group by material.name";
        return ht.find(sql,storeID);
    }
}
