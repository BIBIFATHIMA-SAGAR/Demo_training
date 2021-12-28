package com.thoughtfocus.bank.practicalOnLinkedHashSet;

public class Tester {
	public static void main(String[] args) {
		MobileDAO dao = new MobileDAO();
		
		MobileDTO dto = new MobileDTO();
		dto.setBrandName("apple");
		dto.setMemory(8);
		dto.setMobileID(23654);
		dto.setModelName("6s");
		dto.setNoOfcamera(2);
		dto.setSerialNumber(12);
		dto.setPrice(90000.00);
		dao.add(dto);
		
		
		MobileDTO dto1 = new MobileDTO();
		dto1.setBrandName("samsung");
		dto1.setMemory(4);
		dto1.setMobileID(9874);
		dto1.setModelName("s7");
		dto1.setNoOfcamera(3);
		dto1.setPrice(50000.00);
		dto1.setSerialNumber(13);
		dao.add(dto1);
		
		dao.getAll();
		System.out.println("------------deletedbyId----------");
		dao.deleteByMobileID(9874);
		dao.getAll();
		System.out.println("-------------updatedbySerialNumber-----");
		dao.updateBySerialNumber(12, 40);
		dao.getAll();
		System.out.println("------gettingByBrandName----------");
		try {
		dao.getAllByBrandName("eitjg");
		}
		catch(BrandNameNotFoundException e){
			System.out.println(e.getMessage());
			
		}
		dao.getAll();
	}

}

