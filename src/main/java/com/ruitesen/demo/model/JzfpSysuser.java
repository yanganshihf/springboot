package com.ruitesen.demo.model;

public class JzfpSysuser {
    private String id;

    private String loginname;

    private String password;

    private String departmentname;

    private String name;

    private String mobile;

    private String remarks;

    private String departmentcode;

    private String isonline;

    private String childdepartment;
    
    private String countycode;
    
    private String loginmac;
    
    
    /**
	 * @return the countycode
	 */
	public String getCountycode() {
		return countycode;
	}

	/**
	 * @param countycode the countycode to set
	 */
	public void setCountycode(String countycode) {
		this.countycode = countycode;
	}

	/**
	 * @return the loginmac
	 */
	public String getLoginmac() {
		return loginmac;
	}

	/**
	 * @param loginmac the loginmac to set
	 */
	public void setLoginmac(String loginmac) {
		this.loginmac = loginmac;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getDepartmentcode() {
        return departmentcode;
    }

    public void setDepartmentcode(String departmentcode) {
        this.departmentcode = departmentcode == null ? null : departmentcode.trim();
    }

    public String getIsonline() {
        return isonline;
    }

    public void setIsonline(String isonline) {
        this.isonline = isonline == null ? null : isonline.trim();
    }

    public String getChilddepartment() {
        return childdepartment;
    }

    public void setChilddepartment(String childdepartment) {
        this.childdepartment = childdepartment == null ? null : childdepartment.trim();
    }
}