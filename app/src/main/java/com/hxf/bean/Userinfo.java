package com.hxf.bean;

public class Userinfo {
    private Integer uid;
    private String uinfo;
    private String uaddress;
    private Integer uage;

    public Userinfo() {
    }

    public Userinfo(Integer uid, String uinfo, String uaddress, Integer uage) {
        this.uid = uid;
        this.uinfo = uinfo;
        this.uaddress = uaddress;
        this.uage = uage;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUinfo() {
        return uinfo;
    }

    public void setUinfo(String uinfo) {
        this.uinfo = uinfo;
    }

    public String getUaddress() {
        return uaddress;
    }

    public void setUaddress(String uaddress) {
        this.uaddress = uaddress;
    }

    public Integer getUage() {
        return uage;
    }

    public void setUage(Integer uage) {
        this.uage = uage;
    }
}
