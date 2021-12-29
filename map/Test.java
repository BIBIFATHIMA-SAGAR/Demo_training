package com.thoughtfocus.map;
public class Test {
	public static void main(String[] args) {
		MobileDTO dto = new MobileDTO();
		MobileDAO dao = new MobileDAO();
		dto.setSerialNumber(1);
		dto.setBrandName("apple");
		dto.setMobileId(92873);
		dto.setMemory(8);
		dto.setModelName("6s");
		dto.setNoOfCamera(2);
		dto.setPrice(200000000.0);
		dao.save(1, dto);
		dao.printByKey(1);
		
		
		
		
		MobileDTO dto1 = new MobileDTO();
		dto1.setSerialNumber(2);
		dto1.setBrandName("Samsung");
		dto1.setMobileId(384745);
		dto1.setMemory(8);
		dto1.setModelName("s7");
		dto1.setNoOfCamera(2);
		dto1.setPrice(2000000);
		
		
		dao.save(2, dto1);
		dao.printByKey(2);
		System.out.println("--------");
		dao.deleteByKey(1);
		try {
			dao.deleteByKey(3);
		}
		catch(KeyNotFoundException e) {
			System.out.println(e.getMessage());
			
		}
		dao.printByKey(2);
		MobileDTO dto2 = new MobileDTO();
		dto2.setSerialNumber(2);
		dto2.setBrandName("Redmi");
		dto2.setMobileId(3745);
		dto2.setMemory(4);
		dto2.setModelName("11");
		dto2.setNoOfCamera(2);
		dto2.setPrice(22000);
		System.out.println("-----updatedlist---------");
		dao.updateByKey(2, dto2); 
		try {
			dao.deleteByKey(3);
		}
		catch(KeyNotFoundException e) {
			System.out.println(e.getMessage());
			
		}

		dao.printByKey(2);
		MobileDTO dto4 = new MobileDTO();
		dto4.setSerialNumber(2);
		dto4.setBrandName("Samsung");
		dto4.setMobileId(384745);
		dto4.setMemory(8);
		dto4.setModelName("s7");
		dto4.setNoOfCamera(2);
		dto4.setPrice(2000000);
		dao.save(3, dto);
		dao.printByKey(3);
		
	}
	

}
