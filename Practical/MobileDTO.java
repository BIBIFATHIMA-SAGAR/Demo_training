package com.thoughtfocus.Practical;


public class MobileDTO {
	private int mobileId;
	private String modelName;
	private double price;
	private int memory;
	private String brandName;
	private int serialNumber;
	private int noOfCamera;
	public int getMobileId() {
		return mobileId;
	}
	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getMemory() {
		return memory;
	}
	
	
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getNoOfCamera() {
		return noOfCamera;
	}
	public void setNoOfCamera(int noOfCamera) {
		this.noOfCamera = noOfCamera;
	}
	@Override
	public String toString() {
		return "mobileId=" + mobileId + ", modelName=" + modelName + ", price=" + price + ", memory="
				+ memory + ", brandName=" + brandName + ", serialNumber=" + serialNumber + ", noOfCamera=" + noOfCamera;
	}
	


}






 







