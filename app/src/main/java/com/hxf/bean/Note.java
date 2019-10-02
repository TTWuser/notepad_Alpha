package com.hxf.bean;

public class Note {
    private Integer uid;
    private Integer nid;//note ID
    private String title;
    private String context;
    private String date;
    private String bgcolor;

    public Note() {
    }

    public Note(Integer uid, Integer nid, String title, String context, String date, String bgcolor) {
        this.uid = uid;
        this.nid = nid;
        this.title = title;
        this.context = context;
        this.date = date;
        this.bgcolor = bgcolor;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }
}
