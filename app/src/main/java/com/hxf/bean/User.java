package com.hxf.bean;

public class User {
    private Integer uid;
    private String uname;
    private String upass;

    public User() {
    }

    public User(Integer uid, String uname, String upass) {
        this.uid = uid;
        this.uname = uname;
        this.upass = upass;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
}
