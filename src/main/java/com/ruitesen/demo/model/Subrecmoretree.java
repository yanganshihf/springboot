package com.ruitesen.demo.model;

public class Subrecmoretree {
    private String treecode;

    private String gsqid;

    private String userid;

    public String getTreecode() {
        return treecode;
    }

    public void setTreecode(String treecode) {
        this.treecode = treecode == null ? null : treecode.trim();
    }

    public String getGsqid() {
        return gsqid;
    }

    public void setGsqid(String gsqid) {
        this.gsqid = gsqid == null ? null : gsqid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}