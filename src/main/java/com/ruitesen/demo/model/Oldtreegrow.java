package com.ruitesen.demo.model;

public class Oldtreegrow {
    private Long id;

    private String level;

    private String code;

    private String lamina;

    private String branch;

    private String trsstrunk;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLamina() {
        return lamina;
    }

    public void setLamina(String lamina) {
        this.lamina = lamina == null ? null : lamina.trim();
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    public String getTrsstrunk() {
        return trsstrunk;
    }

    public void setTrsstrunk(String trsstrunk) {
        this.trsstrunk = trsstrunk == null ? null : trsstrunk.trim();
    }
}