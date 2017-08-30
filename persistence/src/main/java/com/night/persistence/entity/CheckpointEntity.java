package com.night.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/8/30.
 */
@Entity
@Table(name = "checkpoint", schema = "dudu.repertory", catalog = "")
public class CheckpointEntity {
    private int id;
    private Timestamp time;
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
    @Column(name = "time", nullable = true)
    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
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

        CheckpointEntity that = (CheckpointEntity) o;

        if (id != that.id) return false;
        if (time != null ? !time.equals(that.time) : that.time != null) return false;
        if (storeNo != null ? !storeNo.equals(that.storeNo) : that.storeNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        result = 31 * result + (storeNo != null ? storeNo.hashCode() : 0);
        return result;
    }
}
