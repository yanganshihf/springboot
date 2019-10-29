package com.ruitesen.demo.model;

import java.util.Date;

/**
 * 古树名木单木历史记录表
 * 
 * @author yanganshi
 *
 */
public class Approvalsingletree {
    private String gsmmid;

    private String userid;

    private String treecode;
    // 审批时间
    private Date approvaltime;

    private String ispass;
       
     // 审批意见
    private String approvalopinion;

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
        this.ispass = ispass;
    }

    public String getApprovalopinion() {
        return approvalopinion;
    }

    public void setApprovalopinion(String approvalopinion) {
        this.approvalopinion = approvalopinion == null ? null : approvalopinion.trim();
    }
}