package com.ruitesen.springboot.pojo;

public class Category {
 

	String OBJECTID;
	String 所在省;
	String 所在县区;
	String 批次;
	String 名称;
	
	public String getOBJECTID() {
		return OBJECTID;
	}
	public void setOBJECTID(String oBJECTID) {
		OBJECTID = oBJECTID;
	}
	public String get所在省() {
		return 所在省;
	}
	public void set所在省(String 所在省) {
		this.所在省 = 所在省;
	}
	public String get所在县区() {
		return 所在县区;
	}
	public void set所在县区(String 所在县区) {
		this.所在县区 = 所在县区;
	}
	public String get批次() {
		return 批次;
	}
	public void set批次(String 批次) {
		this.批次 = 批次;
	}
	public String get名称() {
		return 名称;
	}
	public void set名称(String 名称) {
		this.名称 = 名称;
	}
}