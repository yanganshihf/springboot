package com.ruitesen.demo.model;

public class Oldtreetype {
    private Long id;

    private String code;

    private String treetype;

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

    public String getTreetype() {
        return treetype;
    }

    public void setTreetype(String treetype) {
        this.treetype = treetype == null ? null : treetype.trim();
    }
}