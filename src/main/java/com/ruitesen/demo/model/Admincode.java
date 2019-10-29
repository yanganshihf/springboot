package com.ruitesen.demo.model;

public class Admincode {
	
    private Long id;
    private String adminclass;
    private String admincode;
    private String adminname;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdminclass() {
        return adminclass;
    }

    public void setAdminclass(String adminclass) {
        this.adminclass = adminclass == null ? null : adminclass.trim();
    }

    public String getAdmincode() {
        return admincode;
    }

    public void setAdmincode(String admincode) {
        this.admincode = admincode == null ? null : admincode.trim();
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }
}