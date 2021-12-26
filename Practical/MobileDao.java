package com.thoughtfocus.Practical;


public class MobileDao extends Mobiles{
	MobileDTO[] dto = new MobileDTO[8];
	int index = 0;
	
	

	@Override
	boolean add(MobileDTO dto) {
		if (dto != null) {
			this.dto[index] = dto;
			index++;
			return true;
		}
		
		return false;
	}
	
	@Override
	void getAll() {
		for (int index = 0; index < dto.length; index++) {
			if (dto[index] != null) {
				System.out.println(
						dto[index]);
			}
		}
		System.out.println("--------------------");	
	}
	
	@Override
	MobileDTO deleteByMobileId(int id) {
		MobileDTO detail = new MobileDTO();
		for (int index = 0; index < dto.length; index++) {
			if (dto[index] != null) {
				if (id == (dto[index].getMobileId())) {
					detail = dto[index];
					dto[index] = null;
					return  detail;
				}
	
			}
			else {
				IdNotFoundException idNotFound=new IdNotFoundException();
				throw idNotFound;
			}
	
		}
		return detail;
	}
	@Override
	MobileDTO updateBySerialNumber(int oldNum,int newNum) {
		MobileDTO detail = new MobileDTO();
		for (int index = 0; index < dto.length; index++) {
			if(dto[index] != null && oldNum==(dto[index]).getSerialNumber()) {
				detail = dto[index];
				dto[index].setSerialNumber(newNum);
				
				return detail;
				
			}
		}
		return detail;
		
	}
	@Override
	void getAllByBrandName(String brandName) {
		boolean found = false;
		System.out.println("Sort by brand "+brandName);
		for(int index=0;index<dto.length;index++) {
			if(dto[index]!=null &&
					brandName.equals(dto[index].getBrandName())){
				System.out.println(
						dto[index]);		
					found = true;
			}
		}
		
		if(!found) {
			BrandNameNotFoundException brandNotFound=new BrandNameNotFoundException();
		
			throw brandNotFound;
		}
		
	}
	
	

	

}
