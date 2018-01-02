package com.solace.pojo;

import java.io.Serializable;
import java.util.Date;

public class DepartRole implements Serializable {
    private String id;

    private String roleId;

    private String departId;

    private String departRoleDesc;

    private Date createTime;

    private Date modifyTime;

    private String departRoleIsuse;

    private String departRoleBackup;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getDepartRoleDesc() {
        return departRoleDesc;
    }

    public void setDepartRoleDesc(String departRoleDesc) {
        this.departRoleDesc = departRoleDesc == null ? null : departRoleDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDepartRoleIsuse() {
        return departRoleIsuse;
    }

    public void setDepartRoleIsuse(String departRoleIsuse) {
        this.departRoleIsuse = departRoleIsuse == null ? null : departRoleIsuse.trim();
    }

    public String getDepartRoleBackup() {
        return departRoleBackup;
    }

    public void setDepartRoleBackup(String departRoleBackup) {
        this.departRoleBackup = departRoleBackup == null ? null : departRoleBackup.trim();
    }
}