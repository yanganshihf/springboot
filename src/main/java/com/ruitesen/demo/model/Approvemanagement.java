package com.ruitesen.demo.model;

public class Approvemanagement { 
	private Integer id;

    private String userid;

    private String admincode;
    
    private String username;
    
    private String adminname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getAdmincode() {
        return admincode;
    }

    public void setAdmincode(String admincode) {
        this.admincode = admincode == null ? null : admincode.trim();
    }
    
    public String getUsername() {
  		return username;
  	}

  	public void setUsername(String username) {
  		this.username = username;
  	}

  	public String getAdminname() {
  		return adminname;
  	}

  	public void setAdminname(String adminname) {
  		this.adminname = adminname;
  	}
}