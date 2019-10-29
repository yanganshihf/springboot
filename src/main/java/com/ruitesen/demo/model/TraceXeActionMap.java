/*
 * Welcome to use the TableToBean Tools.
 * 
 * http://vipbooks.iteye.com
 * http://blog.csdn.net/vipbooks
 * http://www.cnblogs.com/vipbooks
 * 
 * Author:bianj
 * Email:edinsker@163.com
 * Version:3.6.0
 */
package com.ruitesen.demo.model;

import java.io.Serializable;

/**
 * (TRACE_XE_ACTION_MAP)
 * 
 * @author yanganshi
 * @version 1.0.0 2018-06-26
 */
public class TraceXeActionMap implements Serializable{
    /** 版本号 */
    private static final long serialVersionUID = -5804527946004076982L;
    
    /**  */
    private Integer traceColumnId;
    
    /**  */
    private String packageName;
    
    /**  */
    private String xeActionName;
    
    /**
     * 获取traceColumnId
     * 
     * @return traceColumnId
     */
    public Integer getTraceColumnId() {
        return this.traceColumnId;
    }
     
    /**
     * 设置traceColumnId
     * 
     * @param traceColumnId
     *          traceColumnId
     */
    public void setTraceColumnId(Integer traceColumnId) {
        this.traceColumnId = traceColumnId;
    }
    
    /**
     * 获取packageName
     * 
     * @return packageName
     */
    public String getPackageName() {
        return this.packageName;
    }
     
    /**
     * 设置packageName
     * 
     * @param packageName
     *          packageName
     */
    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
    
    /**
     * 获取xeActionName
     * 
     * @return xeActionName
     */
    public String getXeActionName() {
        return this.xeActionName;
    }
     
    /**
     * 设置xeActionName
     * 
     * @param xeActionName
     *          xeActionName
     */
    public void setXeActionName(String xeActionName) {
        this.xeActionName = xeActionName;
    }
}