package com.night.persistence.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/30.
 */
@Entity
@Table(name = "production", schema = "dudu.repertory", catalog = "")
public class ProductionEntity {
    private int id;
    private String name;
    private Integer suppliersId;
    private Integer materialId;
    private String packUnit;
    private Double packNumber;
    private Byte status;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "suppliers_id", nullable = true)
    public Integer getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Integer suppliersId) {
        this.suppliersId = suppliersId;
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
    @Column(name = "pack_unit", nullable = true, length = 10)
    public String getPackUnit() {
        return packUnit;
    }

    public void setPackUnit(String packUnit) {
        this.packUnit = packUnit;
    }

    @Basic
    @Column(name = "pack_number", nullable = true, precision = 0)
    public Double getPackNumber() {
        return packNumber;
    }

    public void setPackNumber(Double packNumber) {
        this.packNumber = packNumber;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductionEntity that = (ProductionEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (suppliersId != null ? !suppliersId.equals(that.suppliersId) : that.suppliersId != null) return false;
        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;
        if (packUnit != null ? !packUnit.equals(that.packUnit) : that.packUnit != null) return false;
        if (packNumber != null ? !packNumber.equals(that.packNumber) : that.packNumber != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (suppliersId != null ? suppliersId.hashCode() : 0);
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        result = 31 * result + (packUnit != null ? packUnit.hashCode() : 0);
        result = 31 * result + (packNumber != null ? packNumber.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
