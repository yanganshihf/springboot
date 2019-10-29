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
 * 坡向划分标准与代码表
 * 
 * @author yanganshi
 * @version 1.0.0 2018-06-26
 */
public class Aspecttype implements Serializable{
    /** 版本号 */
    private static final long serialVersionUID = 8594861387152916005L;
    
    /** ID自增 */
    private String id;
    
    /** 代码 */
    private String code;
    
    /** 坡向 */
    private String aspect;
    
    /**
     * 获取ID自增
     * 
     * @return ID自增
     */
    public String getId() {
        return this.id;
    }
     
    /**
     * 设置ID自增
     * 
     * @param id
     *          ID自增
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * 获取代码
     * 
     * @return 代码
     */
    public String getCode() {
        return this.code;
    }
     
    /**
     * 设置代码
     * 
     * @param code
     *          代码
     */
    public void setCode(String code) {
        this.code = code;
    }
    
    /**
     * 获取坡向
     * 
     * @return 坡向
     */
    public String getAspect() {
        return this.aspect;
    }
     
    /**
     * 设置坡向
     * 
     * @param aspect
     *          坡向
     */
    public void setAspect(String aspect) {
        this.aspect = aspect;
    }
}