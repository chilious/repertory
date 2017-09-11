package com.night.persistence.entity;

import javax.persistence.*;

/**
 * Created by Chilious on 2017/9/10.
 */
@Entity
@Table(name = "ref_role_menu", schema = "dudu.repertory", catalog = "")
public class RefRoleMenuEntity {
    private int id;
    private Integer roleId;
    private String menuNo;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role_id", nullable = true)
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "menu_no", nullable = true, length = 8)
    public String getMenuNo() {
        return menuNo;
    }

    public void setMenuNo(String menuNo) {
        this.menuNo = menuNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RefRoleMenuEntity that = (RefRoleMenuEntity) o;

        if (id != that.id) return false;
        if (roleId != null ? !roleId.equals(that.roleId) : that.roleId != null) return false;
        if (menuNo != null ? !menuNo.equals(that.menuNo) : that.menuNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        result = 31 * result + (menuNo != null ? menuNo.hashCode() : 0);
        return result;
    }
}
