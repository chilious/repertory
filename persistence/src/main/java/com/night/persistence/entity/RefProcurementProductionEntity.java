package com.night.persistence.entity;

import javax.persistence.*;

/**
 * Created by Chilious on 2017/9/10.
 */
@Entity
@Table(name = "ref_procurement_production", schema = "dudu.repertory", catalog = "")
public class RefProcurementProductionEntity {
    private int id;
    private Integer procurementId;
    private Integer productionId;
    private Integer packNumber;
    private Double totalNumber;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "production_id", nullable = true)
    public Integer getProductionId() {
        return productionId;
    }

    public void setProductionId(Integer productionId) {
        this.productionId = productionId;
    }

    @Basic
    @Column(name = "pack_number", nullable = true)
    public Integer getPackNumber() {
        return packNumber;
    }

    public void setPackNumber(Integer packNumber) {
        this.packNumber = packNumber;
    }

    @Basic
    @Column(name = "total_number", nullable = true, precision = 0)
    public Double getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(Double totalNumber) {
        this.totalNumber = totalNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefProcurementProductionEntity that = (RefProcurementProductionEntity) o;

        if (id != that.id) return false;
        if (procurementId != null ? !procurementId.equals(that.procurementId) : that.procurementId != null)
            return false;
        if (productionId != null ? !productionId.equals(that.productionId) : that.productionId != null) return false;
        if (packNumber != null ? !packNumber.equals(that.packNumber) : that.packNumber != null) return false;
        if (totalNumber != null ? !totalNumber.equals(that.totalNumber) : that.totalNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (procurementId != null ? procurementId.hashCode() : 0);
        result = 31 * result + (productionId != null ? productionId.hashCode() : 0);
        result = 31 * result + (packNumber != null ? packNumber.hashCode() : 0);
        result = 31 * result + (totalNumber != null ? totalNumber.hashCode() : 0);
        return result;
    }
}
