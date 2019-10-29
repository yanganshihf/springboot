package com.ruitesen.demo.model;

public class Soiltype {
    private Long id;

    private String soilorder;

    private String soilclass;

    private String soilcode;

    private String soildistributed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoilorder() {
        return soilorder;
    }

    public void setSoilorder(String soilorder) {
        this.soilorder = soilorder == null ? null : soilorder.trim();
    }

    public String getSoilclass() {
        return soilclass;
    }

    public void setSoilclass(String soilclass) {
        this.soilclass = soilclass == null ? null : soilclass.trim();
    }

    public String getSoilcode() {
        return soilcode;
    }

    public void setSoilcode(String soilcode) {
        this.soilcode = soilcode == null ? null : soilcode.trim();
    }

    public String getSoildistributed() {
        return soildistributed;
    }

    public void setSoildistributed(String soildistributed) {
        this.soildistributed = soildistributed == null ? null : soildistributed.trim();
    }
}