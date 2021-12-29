package com.thoughtfocus.map;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(brandName, memory, mobileId, modelName, noOfCamera, price, serialNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobileDTO other = (MobileDTO) obj;
		return Objects.equals(brandName, other.brandName) && memory == other.memory && mobileId == other.mobileId
				&& Objects.equals(modelName, other.modelName) && noOfCamera == other.noOfCamera
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& serialNumber == other.serialNumber;
	}
	
	

		
	}
	


