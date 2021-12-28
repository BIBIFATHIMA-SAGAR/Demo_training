package com.thoughtfocus.bank.practicalOnLinkedHashSet;

public interface Mobile {
	boolean add(MobileDTO dto);
	void getAll();
	MobileDTO deleteByMobileID(int mobileId);
	MobileDTO updateBySerialNumber(int oldsNumber,int newNumber);
	void getAllByBrandName(String brandName);

}
