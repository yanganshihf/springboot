package com.ruitesen.demo.model;

public class Soilcompactness {
    private Long id;

    private String code;

    private String compactness;

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

    public String getCompactness() {
        return compactness;
    }

    public void setCompactness(String compactness) {
        this.compactness = compactness == null ? null : compactness.trim();
    }
}