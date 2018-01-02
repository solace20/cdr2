package com.solace.pojo;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    private String id;

    private String roleId;

    private String roleName;

    private String roleDesc;

    private Date createTime;

    private Date modifyTime;

    private String roleIsuse;

    private String powerId;

    private String roleBackup;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
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

    public String getRoleIsuse() {
        return roleIsuse;
    }

    public void setRoleIsuse(String roleIsuse) {
        this.roleIsuse = roleIsuse == null ? null : roleIsuse.trim();
    }

    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId == null ? null : powerId.trim();
    }

    public String getRoleBackup() {
        return roleBackup;
    }

    public void setRoleBackup(String roleBackup) {
        this.roleBackup = roleBackup == null ? null : roleBackup.trim();
    }
}