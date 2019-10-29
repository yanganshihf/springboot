package com.ruitesen.demo.model;

public class Permissions {
    private Long permid;

    private String permname;

    public Long getPermid() {
        return permid;
    }

    public void setPermid(Long permid) {
        this.permid = permid;
    }

    public String getPermname() {
        return permname;
    }

    public void setPermname(String permname) {
        this.permname = permname == null ? null : permname.trim();
    }
}