package com.thoughtfocus.Practical;

public abstract class Mobiles{
	abstract boolean add(MobileDTO dto);
	abstract void getAll();
	abstract MobileDTO deleteByMobileId(int id);
	abstract MobileDTO updateBySerialNumber(int oldNum,int newNum);
	abstract void getAllByBrandName(String brandName);

	
	 
	
}