package com.solace.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String id;

    private String userId;

    private String userName;

    private String userDesc;

    private String password;

    private Date createTime;

    private Date modifyTime;

    private String userIsuse;

    private String userDepartid;

    private String userSex;

    private String userDuty;

    private String userPhone;

    private String userEmail;

    private Date userBirthday;

    private String userBackup;

    private Byte flag;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc == null ? null : userDesc.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
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

    public String getUserIsuse() {
        return userIsuse;
    }

    public void setUserIsuse(String userIsuse) {
        this.userIsuse = userIsuse == null ? null : userIsuse.trim();
    }

    public String getUserDepartid() {
        return userDepartid;
    }

    public void setUserDepartid(String userDepartid) {
        this.userDepartid = userDepartid == null ? null : userDepartid.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserDuty() {
        return userDuty;
    }

    public void setUserDuty(String userDuty) {
        this.userDuty = userDuty == null ? null : userDuty.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserBackup() {
        return userBackup;
    }

    public void setUserBackup(String userBackup) {
        this.userBackup = userBackup == null ? null : userBackup.trim();
    }

    public Byte getFlag() {
        return flag;
    }

    public void setFlag(Byte flag) {
        this.flag = flag;
    }
}