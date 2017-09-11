package com.night.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chilious on 2017/9/10.
 */
@Entity
@Table(name = "material", schema = "dudu.repertory", catalog = "")
public class MaterialEntity {
    private int id;
    private String name;
    private String unit;
    private Double machineWarnLine;
    private Double storeWarnLine;
    private Timestamp createTime;
    private Integer createrId;
    private Timestamp updateTime;
    private Integer updaterId;
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
    @Column(name = "unit", nullable = true, length = 10)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "machine_warn_line", nullable = true, precision = 0)
    public Double getMachineWarnLine() {
        return machineWarnLine;
    }

    public void setMachineWarnLine(Double machineWarnLine) {
        this.machineWarnLine = machineWarnLine;
    }

    @Basic
    @Column(name = "store_warn_line", nullable = true, precision = 0)
    public Double getStoreWarnLine() {
        return storeWarnLine;
    }

    public void setStoreWarnLine(Double storeWarnLine) {
        this.storeWarnLine = storeWarnLine;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "creater_id", nullable = true)
    public Integer getCreaterId() {
        return createrId;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    @Basic
    @Column(name = "update_time", nullable = true)
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "updater_id", nullable = true)
    public Integer getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(Integer updaterId) {
        this.updaterId = updaterId;
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

        MaterialEntity that = (MaterialEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (machineWarnLine != null ? !machineWarnLine.equals(that.machineWarnLine) : that.machineWarnLine != null)
            return false;
        if (storeWarnLine != null ? !storeWarnLine.equals(that.storeWarnLine) : that.storeWarnLine != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (createrId != null ? !createrId.equals(that.createrId) : that.createrId != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (updaterId != null ? !updaterId.equals(that.updaterId) : that.updaterId != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (machineWarnLine != null ? machineWarnLine.hashCode() : 0);
        result = 31 * result + (storeWarnLine != null ? storeWarnLine.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createrId != null ? createrId.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updaterId != null ? updaterId.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
