package com.ruitesen.demo.model;

public class Treecuriosity {
    private Long id;

    private String code;

    private String curiosity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCuriosity() {
        return curiosity;
    }

    public void setCuriosity(String curiosity) {
        this.curiosity = curiosity == null ? null : curiosity.trim();
    }
}