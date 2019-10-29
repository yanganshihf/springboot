package com.ruitesen.demo.model;

import java.util.Date;

public class PatrolTrail2 extends PatrolTrail2Key {
    private String accountnum;

    private String personname;

    private Float traillen;

    private Date ts;

    private String department;

    private String projecttype;

    private String mobile;

    private String childdepartment;

    private String trailpoint;

    public String getAccountnum() {
        return accountnum;
    }

    public void setAccountnum(String accountnum) {
        this.accountnum = accountnum == null ? null : accountnum.trim();
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public Float getTraillen() {
        return traillen;
    }

    public void setTraillen(Float traillen) {
        this.traillen = traillen;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype == null ? null : projecttype.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getChilddepartment() {
        return childdepartment;
    }

    public void setChilddepartment(String childdepartment) {
        this.childdepartment = childdepartment == null ? null : childdepartment.trim();
    }

    public String getTrailpoint() {
        return trailpoint;
    }

    public void setTrailpoint(String trailpoint) {
        this.trailpoint = trailpoint == null ? null : trailpoint.trim();
    }
}