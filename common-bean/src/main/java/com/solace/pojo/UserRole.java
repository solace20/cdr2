package com.solace.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserRole implements Serializable {
    private String id;

    private String userId;

    private String roleid;

    private String userRoleDesc;

    private Date createTime;

    private Date modifyTime;

    private String userRoleIsuse;

    private String userRoleBackup;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getUserRoleDesc() {
        return userRoleDesc;
    }

    public void setUserRoleDesc(String userRoleDesc) {
        this.userRoleDesc = userRoleDesc == null ? null : userRoleDesc.trim();
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

    public String getUserRoleIsuse() {
        return userRoleIsuse;
    }

    public void setUserRoleIsuse(String userRoleIsuse) {
        this.userRoleIsuse = userRoleIsuse == null ? null : userRoleIsuse.trim();
    }

    public String getUserRoleBackup() {
        return userRoleBackup;
    }

    public void setUserRoleBackup(String userRoleBackup) {
        this.userRoleBackup = userRoleBackup == null ? null : userRoleBackup.trim();
    }
}