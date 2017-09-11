package com.night.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/9/11.
 */
@Entity
@Table(name = "ref_checkpoint_material", schema = "dudu.repertory", catalog = "")
public class RefCheckpointMaterialEntity {
    private int id;
    private Integer checkpointId;
    private Integer materialId;
    private Integer packNumber;
    private Double scatter;
    private Double difference;
    private BigDecimal money;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "checkpoint_id", nullable = true)
    public Integer getCheckpointId() {
        return checkpointId;
    }

    public void setCheckpointId(Integer checkpointId) {
        this.checkpointId = checkpointId;
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
    @Column(name = "difference", nullable = true, precision = 0)
    public Double getDifference() {
        return difference;
    }

    public void setDifference(Double difference) {
        this.difference = difference;
    }

    @Basic
    @Column(name = "money", nullable = true, precision = 2)
    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefCheckpointMaterialEntity that = (RefCheckpointMaterialEntity) o;

        if (id != that.id) return false;
        if (checkpointId != null ? !checkpointId.equals(that.checkpointId) : that.checkpointId != null) return false;
        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;
        if (packNumber != null ? !packNumber.equals(that.packNumber) : that.packNumber != null) return false;
        if (scatter != null ? !scatter.equals(that.scatter) : that.scatter != null) return false;
        if (difference != null ? !difference.equals(that.difference) : that.difference != null) return false;
        if (money != null ? !money.equals(that.money) : that.money != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (checkpointId != null ? checkpointId.hashCode() : 0);
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        result = 31 * result + (packNumber != null ? packNumber.hashCode() : 0);
        result = 31 * result + (scatter != null ? scatter.hashCode() : 0);
        result = 31 * result + (difference != null ? difference.hashCode() : 0);
        result = 31 * result + (money != null ? money.hashCode() : 0);
        return result;
    }
}
