package com.ruitesen.demo.model;

import java.util.Date;

/**
 * 古树群审批历史记录表
 * 
 * @author yanganshi
 * @time 2018-7-3 08:47:54
 */
public class Approvalmoretree {
    private String gsqid;

    private String  userid;

    private String treecode;
    /**
     * 审批时间
     */
    private Date approvaltime;

    private String ispass;
    /**
     * 审批意见
     */
    private String approvalopinion;

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
        this.userid = userid;
    }

    public String getTreecode() {
        return treecode;
    }

    public void setTreecode(String treecode) {
        this.treecode = treecode == null ? null : treecode.trim();
    }

    public Date getApprovaltime() {
        return approvaltime;
    }

    public void setApprovaltime(Date approvaltime) {
        this.approvaltime = approvaltime;
    }

    public String getIspass() {
        return ispass;
    }

    public void setIspass(String ispass) {
        this.ispass = ispass == null ? null : ispass.trim();
    }

    public String getApprovalopinion() {
        return approvalopinion;
    }

    public void setApprovalopinion(String approvalopinion) {
        this.approvalopinion = approvalopinion == null ? null : approvalopinion.trim();
    }
}