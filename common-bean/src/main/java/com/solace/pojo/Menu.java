package com.solace.pojo;

import java.io.Serializable;
import java.util.Date;

public class Menu implements Serializable {
    private String id;

    private String menuName;

    private String menuDesc;

    private Date createTime;

    private Date modifyTime;

    private String menuLevel;

    private String menuFather;

    private String menuLink;

    private String menuIsdisplay;

    private String menuBackup;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc == null ? null : menuDesc.trim();
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

    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel == null ? null : menuLevel.trim();
    }

    public String getMenuFather() {
        return menuFather;
    }

    public void setMenuFather(String menuFather) {
        this.menuFather = menuFather == null ? null : menuFather.trim();
    }

    public String getMenuLink() {
        return menuLink;
    }

    public void setMenuLink(String menuLink) {
        this.menuLink = menuLink == null ? null : menuLink.trim();
    }

    public String getMenuIsdisplay() {
        return menuIsdisplay;
    }

    public void setMenuIsdisplay(String menuIsdisplay) {
        this.menuIsdisplay = menuIsdisplay == null ? null : menuIsdisplay.trim();
    }

    public String getMenuBackup() {
        return menuBackup;
    }

    public void setMenuBackup(String menuBackup) {
        this.menuBackup = menuBackup == null ? null : menuBackup.trim();
    }
}