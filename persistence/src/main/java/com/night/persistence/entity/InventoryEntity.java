package com.night.persistence.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/30.
 */
@Entity
@Table(name = "inventory", schema = "dudu.repertory", catalog = "")
public class InventoryEntity {
    private int id;
    private Integer materialId;
    private Integer packNumber;
    private Double scatter;
    private String storeNo;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "material_id", nullable = true)
    public Integer getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Integer materialId) {
        this.materialId = materialId;
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
    @Column(name = "scatter", nullable = true, precision = 0)
    public Double getScatter() {
        return scatter;
    }

    public void setScatter(Double scatter) {
        this.scatter = scatter;
    }

    @Basic
    @Column(name = "store_no", nullable = true, length = 51)
    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InventoryEntity that = (InventoryEntity) o;

        if (id != that.id) return false;
        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;
        if (packNumber != null ? !packNumber.equals(that.packNumber) : that.packNumber != null) return false;
        if (scatter != null ? !scatter.equals(that.scatter) : that.scatter != null) return false;
        if (storeNo != null ? !storeNo.equals(that.storeNo) : that.storeNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        result = 31 * result + (packNumber != null ? packNumber.hashCode() : 0);
        result = 31 * result + (scatter != null ? scatter.hashCode() : 0);
        result = 31 * result + (storeNo != null ? storeNo.hashCode() : 0);
        return result;
    }
}
