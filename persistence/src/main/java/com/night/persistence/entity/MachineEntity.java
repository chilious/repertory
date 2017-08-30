package com.night.persistence.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/8/30.
 */
@Entity
@Table(name = "machine", schema = "dudu.repertory", catalog = "")
public class MachineEntity {
    private int id;
    private String no;
    private Integer stationId;
    private String stationName;
    private Integer operatorId;
    private String operatorName;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "no", nullable = true, length = 6)
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Basic
    @Column(name = "station_id", nullable = true)
    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    @Basic
    @Column(name = "station_name", nullable = true, length = 100)
    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Basic
    @Column(name = "operator_id", nullable = true)
    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    @Basic
    @Column(name = "operator_name", nullable = true, length = 100)
    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MachineEntity that = (MachineEntity) o;

        if (id != that.id) return false;
        if (no != null ? !no.equals(that.no) : that.no != null) return false;
        if (stationId != null ? !stationId.equals(that.stationId) : that.stationId != null) return false;
        if (stationName != null ? !stationName.equals(that.stationName) : that.stationName != null) return false;
        if (operatorId != null ? !operatorId.equals(that.operatorId) : that.operatorId != null) return false;
        if (operatorName != null ? !operatorName.equals(that.operatorName) : that.operatorName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (no != null ? no.hashCode() : 0);
        result = 31 * result + (stationId != null ? stationId.hashCode() : 0);
        result = 31 * result + (stationName != null ? stationName.hashCode() : 0);
        result = 31 * result + (operatorId != null ? operatorId.hashCode() : 0);
        result = 31 * result + (operatorName != null ? operatorName.hashCode() : 0);
        return result;
    }
}
