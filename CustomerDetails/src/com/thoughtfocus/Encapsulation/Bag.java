package com.thoughtfocus.Encapsulation;

public class Bag {		//should be public to have javabean
	private String brand;
	private int noOfPockets;
	private String quantity;
	private double price;
	private String type;
	
	public Bag() {     //default const 
		
	}
	//setters and getter methods go to source go to get and set method

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNoOfPockets() {
		
		return noOfPockets;
	}

	public int setNoOfPockets(int noOfPockets) {
		if(noOfPockets>5)
			
		this.noOfPockets = noOfPockets;
		return noOfPockets;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
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
	
	
	

}
