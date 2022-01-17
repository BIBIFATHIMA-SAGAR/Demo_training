package com.thoughtfocus.jdbc.Assessment3;

public class StationaryDTO {
	private String name;
	private double price;
	private String type;
	private double quantity;
	private String brandName;
	private int serialNum;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	@Override
	public String toString() {
		return "StationaryDTO [name=" + name + ", price=" + price + ", type=" + type + ", quantity=" + quantity
				+ ", brandName=" + brandName + ", serialNum=" + serialNum + "]";
	}
	
	

}
