package com.night.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by Administrator on 2017/8/30.
 */
@Entity
@Table(name = "store", schema = "dudu.repertory", catalog = "")
public class StoreEntity {
    private int id;
    private String name;
    private String address;
    private BigDecimal wastageMoney;
    private BigDecimal expressMoney;
    private BigDecimal materialMoney;
    private String no;

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
    @Column(name = "address", nullable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "wastage_money", nullable = true, precision = 2)
    public BigDecimal getWastageMoney() {
        return wastageMoney;
    }

    public void setWastageMoney(BigDecimal wastageMoney) {
        this.wastageMoney = wastageMoney;
    }

    @Basic
    @Column(name = "express_money", nullable = true, precision = 2)
    public BigDecimal getExpressMoney() {
        return expressMoney;
    }

    public void setExpressMoney(BigDecimal expressMoney) {
        this.expressMoney = expressMoney;
    }

    @Basic
    @Column(name = "material_money", nullable = true, precision = 2)
    public BigDecimal getMaterialMoney() {
        return materialMoney;
    }

    public void setMaterialMoney(BigDecimal materialMoney) {
        this.materialMoney = materialMoney;
    }

    @Basic
    @Column(name = "no", nullable = true, length = 51)
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StoreEntity that = (StoreEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (wastageMoney != null ? !wastageMoney.equals(that.wastageMoney) : that.wastageMoney != null) return false;
        if (expressMoney != null ? !expressMoney.equals(that.expressMoney) : that.expressMoney != null) return false;
        if (materialMoney != null ? !materialMoney.equals(that.materialMoney) : that.materialMoney != null)
            return false;
        if (no != null ? !no.equals(that.no) : that.no != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (wastageMoney != null ? wastageMoney.hashCode() : 0);
        result = 31 * result + (expressMoney != null ? expressMoney.hashCode() : 0);
        result = 31 * result + (materialMoney != null ? materialMoney.hashCode() : 0);
        result = 31 * result + (no != null ? no.hashCode() : 0);
        return result;
    }
}
