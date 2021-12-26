package com.thoughtfocus.Practical;

public class Test {
	public static void main(String[] args) {
		MobileDTO dto = new MobileDTO();
		Mobiles dao = new MobileDao();
		dto.setSerialNumber(1);
		dto.setBrandName("apple");
		dto.setMobileId(92873);
		dto.setMemory(8);
		dto.setModelName("6s");
		dto.setNoOfCamera(2);
		dto.setPrice(200000000.0);
		
		System.out.println("--------");
		

		
		dao.add(dto);
		
		MobileDTO dto1 = new MobileDTO();
		dto1.setSerialNumber(2);
		dto1.setBrandName("Samsung");
		dto1.setMobileId(384745);
		dto1.setMemory(8);
		dto1.setModelName("s7");
		dto1.setNoOfCamera(2);
		dto1.setPrice(2000000);
		dao.add(dto1);
		
		
		dao.getAll();
		dao.updateBySerialNumber(1, 2);
		System.out.println("updated serial number");
		dao.getAll();
		dao.getAllByBrandName("Samsung");
		try {
		dao.getAllByBrandName("abc");
		}
		catch(BrandNameNotFoundException e) {
			e.printStackTrace();
		}
		dao.deleteByMobileId(384745);
		try {
			dao.deleteByMobileId(38474);
		}
		catch(IdNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.println("----After deleting---\n");
		dao.getAll();
		
		
		
		
	}

}



