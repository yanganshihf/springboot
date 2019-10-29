package com.ruitesen.demo.model;

public class Subrecsingletree {
    private String treecode;

    private String gsmmid;

    private String userid;

    public String getTreecode() {
        return treecode;
    }

    public void setTreecode(String treecode) {
        this.treecode = treecode == null ? null : treecode.trim();
    }

    public String getGsmmid() {
        return gsmmid;
    }

    public void setGsmmid(String gsmmid) {
        this.gsmmid = gsmmid == null ? null : gsmmid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}