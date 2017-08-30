package com.night.persistence.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/30.
 */
@Entity
@Table(name = "inventory_machine", schema = "dudu.repertory", catalog = "")
public class InventoryMachineEntity {
    private int id;
    private String machineNo;
    private Integer materialId;
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
    @Column(name = "machine_no", nullable = true, length = 10)
    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo;
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

        InventoryMachineEntity that = (InventoryMachineEntity) o;

        if (id != that.id) return false;
        if (machineNo != null ? !machineNo.equals(that.machineNo) : that.machineNo != null) return false;
        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;
        if (totalNumber != null ? !totalNumber.equals(that.totalNumber) : that.totalNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (machineNo != null ? machineNo.hashCode() : 0);
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        result = 31 * result + (totalNumber != null ? totalNumber.hashCode() : 0);
        return result;
    }
}
