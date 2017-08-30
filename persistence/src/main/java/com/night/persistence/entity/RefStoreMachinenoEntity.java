package com.night.persistence.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/30.
 */
@Entity
@Table(name = "ref_store_machineno", schema = "dudu.repertory", catalog = "")
public class RefStoreMachinenoEntity {
    private int id;
    private Integer storeId;
    private String machineNo;

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
    @Column(name = "machine_no", nullable = true, length = 6)
    public String getMachineNo() {
        return machineNo;
    }

    public void setMachineNo(String machineNo) {
        this.machineNo = machineNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefStoreMachinenoEntity that = (RefStoreMachinenoEntity) o;

        if (id != that.id) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (machineNo != null ? !machineNo.equals(that.machineNo) : that.machineNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (machineNo != null ? machineNo.hashCode() : 0);
        return result;
    }
}
