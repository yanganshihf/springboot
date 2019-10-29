package com.ruitesen.demo.model;

public class Gradienttype {
    private Long id;

    private String code;

    private String gradient;

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

    public String getGradient() {
        return gradient;
    }

    public void setGradient(String gradient) {
        this.gradient = gradient == null ? null : gradient.trim();
    }
}