package com.ruitesen.demo.model;

import java.math.BigDecimal;
import java.util.Date;

public class Realtimeposition2 {
    private String sbid;

    private Date date;

    private Date time;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String xcoor;

    private String ycoor;

    private Integer isonline;

    private Date ts;

    private String projecttype;

    private String mobile;

    public String getSbid() {
        return sbid;
    }

    public void setSbid(String sbid) {
        this.sbid = sbid == null ? null : sbid.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
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

    public Integer getIsonline() {
        return isonline;
    }

    public void setIsonline(Integer isonline) {
        this.isonline = isonline;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
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
}