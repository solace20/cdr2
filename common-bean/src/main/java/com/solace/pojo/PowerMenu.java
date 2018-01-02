package com.solace.pojo;

import java.io.Serializable;
import java.util.Date;

public class PowerMenu implements Serializable {
    private String id;

    private String powerId;

    private String menuId;

    private String powerMenuDesc;

    private Date createTime;

    private Date modifyTime;

    private String powerMenuIsuse;

    private String powerMenuBackup;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId == null ? null : powerId.trim();
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public String getPowerMenuDesc() {
        return powerMenuDesc;
    }

    public void setPowerMenuDesc(String powerMenuDesc) {
        this.powerMenuDesc = powerMenuDesc == null ? null : powerMenuDesc.trim();
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

    public String getPowerMenuIsuse() {
        return powerMenuIsuse;
    }

    public void setPowerMenuIsuse(String powerMenuIsuse) {
        this.powerMenuIsuse = powerMenuIsuse == null ? null : powerMenuIsuse.trim();
    }

    public String getPowerMenuBackup() {
        return powerMenuBackup;
    }

    public void setPowerMenuBackup(String powerMenuBackup) {
        this.powerMenuBackup = powerMenuBackup == null ? null : powerMenuBackup.trim();
    }
}