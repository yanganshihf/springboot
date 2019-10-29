package com.ruitesen.demo.model;

public class Gsmmresourcelist {
	private Long id;

	private String treecode;

	private String chinesename;

	private String popularname;

	private String latinname;

	private String family;

	private String genera;

	private String treenumber;

	private String classorder;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTreecode() {
		return treecode;
	}

	public void setTreecode(String treecode) {
		this.treecode = treecode == null ? null : treecode.trim();
	}

	public String getChinesename() {
		return chinesename;
	}

	public void setChinesename(String chinesename) {
		this.chinesename = chinesename == null ? null : chinesename.trim();
	}

	public String getPopularname() {
		return popularname;
	}

	public void setPopularname(String popularname) {
		this.popularname = popularname == null ? null : popularname.trim();
	}

	public String getLatinname() {
		return latinname;
	}

	public void setLatinname(String latinname) {
		this.latinname = latinname == null ? null : latinname.trim();
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family == null ? null : family.trim();
	}

	public String getGenera() {
		return genera;
	}

	public void setGenera(String genera) {
		this.genera = genera == null ? null : genera.trim();
	}

	public String getTreenumber() {
		return treenumber;
	}

	public void setTreenumber(String treenumber) {
		this.treenumber = treenumber;
	}

	public String getClassorder() {
		return classorder;
	}

	public void setClassorder(String classorder) {
		this.classorder = classorder;
	}
		
}