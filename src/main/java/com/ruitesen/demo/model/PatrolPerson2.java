package com.ruitesen.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class PatrolPerson2 {
    private String id;

    private String accountnum;

    private String personname;

    private String sex;

    private String mobile;

    private String regionname;

    private BigDecimal regionarea;

    private String identifyphoto;

    private Date ts;

    private String department;

    private Integer permission;

    private String hasregions;

    private String departmentval;

    private String projecttype;

    private Date employdate;

    private Integer isongard;

    private Date unemploydate;

    private Integer isonline;

    private String childdepartmentval;

    private String childdepartment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getRegionname() {
        return regionname;
    }

    public void setRegionname(String regionname) {
        this.regionname = regionname == null ? null : regionname.trim();
    }

    public BigDecimal getRegionarea() {
        return regionarea;
    }

    public void setRegionarea(BigDecimal regionarea) {
        this.regionarea = regionarea;
    }

    public String getIdentifyphoto() {
        return identifyphoto;
    }

    public void setIdentifyphoto(String identifyphoto) {
        this.identifyphoto = identifyphoto == null ? null : identifyphoto.trim();
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

    public Integer getPermission() {
        return permission;
    }

    public void setPermission(Integer permission) {
        this.permission = permission;
    }

    public String getHasregions() {
        return hasregions;
    }

    public void setHasregions(String hasregions) {
        this.hasregions = hasregions == null ? null : hasregions.trim();
    }

    public String getDepartmentval() {
        return departmentval;
    }

    public void setDepartmentval(String departmentval) {
        this.departmentval = departmentval == null ? null : departmentval.trim();
    }

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype == null ? null : projecttype.trim();
    }

    public Date getEmploydate() {
        return employdate;
    }

    public void setEmploydate(Date employdate) {
        this.employdate = employdate;
    }

    public Integer getIsongard() {
        return isongard;
    }

    public void setIsongard(Integer isongard) {
        this.isongard = isongard;
    }

    public Date getUnemploydate() {
        return unemploydate;
    }

    public void setUnemploydate(Date unemploydate) {
        this.unemploydate = unemploydate;
    }

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }

    public String getChilddepartmentval() {
        return childdepartmentval;
    }

    public void setChilddepartmentval(String childdepartmentval) {
        this.childdepartmentval = childdepartmentval == null ? null : childdepartmentval.trim();
    }

    public String getChilddepartment() {
        return childdepartment;
    }

    public void setChilddepartment(String childdepartment) {
        this.childdepartment = childdepartment == null ? null : childdepartment.trim();
    }
}