package com.ruitesen.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class PatrolEvent2 {
    private String id;

    private String personnum;

    private String personname;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String xcoor;

    private String ycoor;

    private Date time;

    private Date uploadtime;

    private String eventname;

    private Date responsetime;

    private String responsepeople;

    private Integer state;

    private String department;

    private String mobile;

    private String projecttype;

    private String eventtype;

    private String childdepartment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPersonnum() {
        return personnum;
    }

    public void setPersonnum(String personnum) {
        this.personnum = personnum == null ? null : personnum.trim();
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname == null ? null : personname.trim();
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public String getXcoor() {
        return xcoor;
    }

    public void setXcoor(String xcoor) {
        this.xcoor = xcoor == null ? null : xcoor.trim();
    }

    public String getYcoor() {
        return ycoor;
    }

    public void setYcoor(String ycoor) {
        this.ycoor = ycoor == null ? null : ycoor.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Date getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(Date uploadtime) {
        this.uploadtime = uploadtime;
    }

    public String getEventname() {
        return eventname;
    }

    public void setEventname(String eventname) {
        this.eventname = eventname == null ? null : eventname.trim();
    }

    public Date getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(Date responsetime) {
        this.responsetime = responsetime;
    }

    public String getResponsepeople() {
        return responsepeople;
    }

    public void setResponsepeople(String responsepeople) {
        this.responsepeople = responsepeople == null ? null : responsepeople.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype == null ? null : projecttype.trim();
    }

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype == null ? null : eventtype.trim();
    }

    public String getChilddepartment() {
        return childdepartment;
    }

    public void setChilddepartment(String childdepartment) {
        this.childdepartment = childdepartment == null ? null : childdepartment.trim();
    }
}