/**
 * 
 */
package com.ruitesen.demo.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 * @author	cl.he
 *
 * @Description:
 *
 * @Date	2018年9月10日 下午1:35:51 
 */
@XmlType(propOrder = { "StartColumn", "EndColumn", "StartRow", "EndRow","PicutrePath"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class ImageItem implements Serializable{  
	private static final long serialVersionUID = 1L;

	@XmlElement(name="StartColumn")
	private String StartColumn;
	 
	@XmlElement(name="EndColumn")
	private String EndColumn;
	
    @XmlElement(name="StartRow") 
	private String StartRow;
		        
    @XmlElement(name="EndRow") 
    private String EndRow;  
    
    @XmlElement(name="PicutrePath") 
    private String PicutrePath; 
    
	public String getPicutrePath() {
		return PicutrePath;
	}

	public void setPicutrePath(String picutrePath) {
		PicutrePath = picutrePath;
	}

	public String getStartColumn() {
		return StartColumn;
	}

	public void setStartColumn(String startColumn) {
		StartColumn = startColumn;
	}

	public String getEndColumn() {
		return EndColumn;
	}

	public void setEndColumn(String endColumn) {
		EndColumn = endColumn;
	}

	public String getStartRow() {
		return StartRow;
	}

	public void setStartRow(String startRow) {
		StartRow = startRow;
	}

	public String getEndRow() {
		return EndRow;
	}

	public void setEndRow(String endRow) {
		EndRow = endRow;
	}
	 
}


