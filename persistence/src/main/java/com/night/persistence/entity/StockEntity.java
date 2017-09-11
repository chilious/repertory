package com.night.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/9/11.
 */
@Entity
@Table(name = "stock", schema = "dudu.repertory", catalog = "")
public class StockEntity {
    private int id;
    private Integer storeId;
    private Byte sourceType;
    private BigDecimal productSpending;
    private BigDecimal expressSpending;
    private Byte expressPayer;
    private Byte expressCompany;
    private String expressNumber;
    private Timestamp time;
    private Integer procurementId;
    private Byte status;
    private Integer sourceStoreId;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "store_id", nullable = true)
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "source_type", nullable = true)
    public Byte getSourceType() {
        return sourceType;
    }

    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    @Basic
    @Column(name = "product_spending", nullable = true, precision = 2)
    public BigDecimal getProductSpending() {
        return productSpending;
    }

    public void setProductSpending(BigDecimal productSpending) {
        this.productSpending = productSpending;
    }

    @Basic
    @Column(name = "express_spending", nullable = true, precision = 2)
    public BigDecimal getExpressSpending() {
        return expressSpending;
    }

    public void setExpressSpending(BigDecimal expressSpending) {
        this.expressSpending = expressSpending;
    }

    @Basic
    @Column(name = "express_payer", nullable = true)
    public Byte getExpressPayer() {
        return expressPayer;
    }

    public void setExpressPayer(Byte expressPayer) {
        this.expressPayer = expressPayer;
    }

    @Basic
    @Column(name = "express_company", nullable = true)
    public Byte getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(Byte expressCompany) {
        this.expressCompany = expressCompany;
    }

    @Basic
    @Column(name = "express_number", nullable = true, length = 100)
    public String getExpressNumber() {
        return expressNumber;
    }

    public void setExpressNumber(String expressNumber) {
        this.expressNumber = expressNumber;
    }

    @Basic
    @Column(name = "time", nullable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Basic
    @Column(name = "procurement_id", nullable = true)
    public Integer getProcurementId() {
        return procurementId;
    }

    public void setProcurementId(Integer procurementId) {
        this.procurementId = procurementId;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "source_store_id", nullable = true)
    public Integer getSourceStoreId() {
        return sourceStoreId;
    }

    public void setSourceStoreId(Integer sourceStoreId) {
        this.sourceStoreId = sourceStoreId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StockEntity that = (StockEntity) o;

        if (id != that.id) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (sourceType != null ? !sourceType.equals(that.sourceType) : that.sourceType != null) return false;
        if (productSpending != null ? !productSpending.equals(that.productSpending) : that.productSpending != null)
            return false;
        if (expressSpending != null ? !expressSpending.equals(that.expressSpending) : that.expressSpending != null)
            return false;
        if (expressPayer != null ? !expressPayer.equals(that.expressPayer) : that.expressPayer != null) return false;
        if (expressCompany != null ? !expressCompany.equals(that.expressCompany) : that.expressCompany != null)
            return false;
        if (expressNumber != null ? !expressNumber.equals(that.expressNumber) : that.expressNumber != null)
            return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (procurementId != null ? !procurementId.equals(that.procurementId) : that.procurementId != null)
            return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (sourceStoreId != null ? !sourceStoreId.equals(that.sourceStoreId) : that.sourceStoreId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (sourceType != null ? sourceType.hashCode() : 0);
        result = 31 * result + (productSpending != null ? productSpending.hashCode() : 0);
        result = 31 * result + (expressSpending != null ? expressSpending.hashCode() : 0);
        result = 31 * result + (expressPayer != null ? expressPayer.hashCode() : 0);
        result = 31 * result + (expressCompany != null ? expressCompany.hashCode() : 0);
        result = 31 * result + (expressNumber != null ? expressNumber.hashCode() : 0);
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (procurementId != null ? procurementId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (sourceStoreId != null ? sourceStoreId.hashCode() : 0);
        return result;
    }
}
