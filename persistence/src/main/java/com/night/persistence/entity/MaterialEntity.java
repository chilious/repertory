package com.night.persistence.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/30.
 */
@Entity
@Table(name = "material", schema = "dudu.repertory", catalog = "")
public class MaterialEntity {
    private int id;
    private String name;
    private String unit;
    private Double warnLine;

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
    @Column(name = "warn_line", nullable = true, precision = 0)
    public Double getWarnLine() {
        return warnLine;
    }

    public void setWarnLine(Double warnLine) {
        this.warnLine = warnLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialEntity that = (MaterialEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (unit != null ? !unit.equals(that.unit) : that.unit != null) return false;
        if (warnLine != null ? !warnLine.equals(that.warnLine) : that.warnLine != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (warnLine != null ? warnLine.hashCode() : 0);
        return result;
    }
}
