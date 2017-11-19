package models;

import java.io.*;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "product")
//@XmlAccessorType(XmlAccessType.FIELD)
public class Product implements Serializable{

	//private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private double price;
	
	@XmlElement
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	@XmlElement
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public Product(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product(){
		super();
	}
	
	
}
