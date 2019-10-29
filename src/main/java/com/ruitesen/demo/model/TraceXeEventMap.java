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
 * (TRACE_XE_EVENT_MAP)
 * 
 * @author yanganshi
 * @version 1.0.0 2018-06-26
 */
public class TraceXeEventMap implements Serializable{
    /** 版本号 */
    private static final long serialVersionUID = 1598619790262386021L;
    
    /**  */
    private Integer traceEventId;
    
    /**  */
    private String packageName;
    
    /**  */
    private String xeEventName;
    
    /**
     * 获取traceEventId
     * 
     * @return traceEventId
     */
    public Integer getTraceEventId() {
        return this.traceEventId;
    }
     
    /**
     * 设置traceEventId
     * 
     * @param traceEventId
     *          traceEventId
     */
    public void setTraceEventId(Integer traceEventId) {
        this.traceEventId = traceEventId;
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
     * 获取xeEventName
     * 
     * @return xeEventName
     */
    public String getXeEventName() {
        return this.xeEventName;
    }
     
    /**
     * 设置xeEventName
     * 
     * @param xeEventName
     *          xeEventName
     */
    public void setXeEventName(String xeEventName) {
        this.xeEventName = xeEventName;
    }
}