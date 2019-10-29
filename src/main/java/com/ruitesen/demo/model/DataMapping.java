/**
 * 
 */
package com.ruitesen.demo.model;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import java.io.Serializable;
import java.util.*;
/**
 * @author	cl.he
 *
 * @Description:
 *
 * @Date	2018年9月10日 下午1:33:37 
 */
@XmlType(propOrder = { "items", "JImage", "YImage", "TImage"})
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "DataMapping")
public class DataMapping implements Serializable { 
	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "TextItem")
    private List<TextItem> items;
	
	@XmlElement(name = "JImageItem")
    private ImageItem JImage;
	
	@XmlElement(name = "YImageItem")
    private ImageItem YImage;
	
	@XmlElement(name = "TImageItem")
    private ImageItem TImage;
	
	public DataMapping() {
        this.items = new ArrayList<TextItem>();
    }

    public void addProcess(TextItem process) {
        this.items.add(process);
    }

    public Iterator<TextItem> iterator() {
        return items.iterator();
    }

    public List<TextItem> getItems() {
        return this.items;
    }
    

	public ImageItem getJImage() {
		return JImage;
	}

	public void setJImage(ImageItem jImage) {
		JImage = jImage;
	}

	public ImageItem getYImage() {
		return YImage;
	}

	public void setYImage(ImageItem yImage) {
		YImage = yImage;
	}

	public ImageItem getTImage() {
		return TImage;
	}

	public void setTImage(ImageItem tImage) {
		TImage = tImage;
	}
}
