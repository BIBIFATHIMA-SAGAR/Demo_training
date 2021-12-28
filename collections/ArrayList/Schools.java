package com.thoughtfocus.collections.ArrayList;

public class Schools {
	private String name;
	private int noOfStudent;
	private String code;
	private String location;
	
	
	public Schools(String name, int noOfStudent, String code, String location) {
		this.name = name;
		this.noOfStudent = noOfStudent;
		this.code = code;
		this.location = location;
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNoOfStudent() {
		return noOfStudent;
	}


	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Schools [name=" + name + ", noOfStudent=" + noOfStudent + ", code=" + code + ", location=" + location
				+ "]";
	}
	

}
