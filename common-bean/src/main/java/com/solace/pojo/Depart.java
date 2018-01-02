package com.solace.pojo;

import java.io.Serializable;
import java.util.Date;

public class Depart implements Serializable{
    private String departId;

    private String id;

    private String departName;

    private String departDesc;

    private Date createTime;

    private Date modifyTime;

    private String departIsuse;

    private String departFather;

    private String departCompanyid;

    private String departCompanyname;

    private String departBackup;

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getDepartDesc() {
        return departDesc;
    }

    public void setDepartDesc(String departDesc) {
        this.departDesc = departDesc == null ? null : departDesc.trim();
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

    public String getDepartIsuse() {
        return departIsuse;
    }

    public void setDepartIsuse(String departIsuse) {
        this.departIsuse = departIsuse == null ? null : departIsuse.trim();
    }

    public String getDepartFather() {
        return departFather;
    }

    public void setDepartFather(String departFather) {
        this.departFather = departFather == null ? null : departFather.trim();
    }

    public String getDepartCompanyid() {
        return departCompanyid;
    }

    public void setDepartCompanyid(String departCompanyid) {
        this.departCompanyid = departCompanyid == null ? null : departCompanyid.trim();
    }

    public String getDepartCompanyname() {
        return departCompanyname;
    }

    public void setDepartCompanyname(String departCompanyname) {
        this.departCompanyname = departCompanyname == null ? null : departCompanyname.trim();
    }

    public String getDepartBackup() {
        return departBackup;
    }

    public void setDepartBackup(String departBackup) {
        this.departBackup = departBackup == null ? null : departBackup.trim();
    }
}