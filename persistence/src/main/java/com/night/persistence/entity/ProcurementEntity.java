package com.night.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/8/30.
 */
@Entity
@Table(name = "procurement", schema = "dudu.repertory", catalog = "")
public class ProcurementEntity {
    private int id;
    private Integer storeId;
    private Integer proposerId;
    private String proposerName;
    private Timestamp supplyTime;
    private Timestamp auditTime;
    private Integer auditorId;
    private String auditorName;
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
    @Column(name = "store_id", nullable = true)
    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @Basic
    @Column(name = "proposer_id", nullable = true)
    public Integer getProposerId() {
        return proposerId;
    }

    public void setProposerId(Integer proposerId) {
        this.proposerId = proposerId;
    }

    @Basic
    @Column(name = "proposer_name", nullable = true, length = 100)
    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName;
    }

    @Basic
    @Column(name = "supply_time", nullable = true)
    public Timestamp getSupplyTime() {
        return supplyTime;
    }

    public void setSupplyTime(Timestamp supplyTime) {
        this.supplyTime = supplyTime;
    }

    @Basic
    @Column(name = "audit_time", nullable = true)
    public Timestamp getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
    }

    @Basic
    @Column(name = "auditor_id", nullable = true)
    public Integer getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Integer auditorId) {
        this.auditorId = auditorId;
    }

    @Basic
    @Column(name = "auditor_name", nullable = true, length = 100)
    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
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

        ProcurementEntity that = (ProcurementEntity) o;

        if (id != that.id) return false;
        if (storeId != null ? !storeId.equals(that.storeId) : that.storeId != null) return false;
        if (proposerId != null ? !proposerId.equals(that.proposerId) : that.proposerId != null) return false;
        if (proposerName != null ? !proposerName.equals(that.proposerName) : that.proposerName != null) return false;
        if (supplyTime != null ? !supplyTime.equals(that.supplyTime) : that.supplyTime != null) return false;
        if (auditTime != null ? !auditTime.equals(that.auditTime) : that.auditTime != null) return false;
        if (auditorId != null ? !auditorId.equals(that.auditorId) : that.auditorId != null) return false;
        if (auditorName != null ? !auditorName.equals(that.auditorName) : that.auditorName != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (storeId != null ? storeId.hashCode() : 0);
        result = 31 * result + (proposerId != null ? proposerId.hashCode() : 0);
        result = 31 * result + (proposerName != null ? proposerName.hashCode() : 0);
        result = 31 * result + (supplyTime != null ? supplyTime.hashCode() : 0);
        result = 31 * result + (auditTime != null ? auditTime.hashCode() : 0);
        result = 31 * result + (auditorId != null ? auditorId.hashCode() : 0);
        result = 31 * result + (auditorName != null ? auditorName.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }
}
