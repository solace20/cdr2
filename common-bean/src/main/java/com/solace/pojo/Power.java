package com.solace.pojo;

import java.io.Serializable;
import java.util.Date;

public class Power implements Serializable {
    private String id;

    private String powerId;

    private String powerName;

    private String powerDesc;

    private String powerLevel;

    private Date createTime;

    private Date modifyTime;

    private String powerIsuse;

    private String powerBackup;

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

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getPowerDesc() {
        return powerDesc;
    }

    public void setPowerDesc(String powerDesc) {
        this.powerDesc = powerDesc == null ? null : powerDesc.trim();
    }

    public String getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(String powerLevel) {
        this.powerLevel = powerLevel == null ? null : powerLevel.trim();
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

    public String getPowerIsuse() {
        return powerIsuse;
    }

    public void setPowerIsuse(String powerIsuse) {
        this.powerIsuse = powerIsuse == null ? null : powerIsuse.trim();
    }

    public String getPowerBackup() {
        return powerBackup;
    }

    public void setPowerBackup(String powerBackup) {
        this.powerBackup = powerBackup == null ? null : powerBackup.trim();
    }
}