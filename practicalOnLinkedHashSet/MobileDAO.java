package com.thoughtfocus.bank.practicalOnLinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MobileDAO implements Mobile{
	
	private Set<MobileDTO> dtos = new LinkedHashSet<MobileDTO>();

	@Override
	public boolean add(MobileDTO dto) {
		if(dto != null) {
			if(dtos.add(dto)) {
				return true; 
			}
		}
		return false;
	}
		
	
		
	@Override
	public void getAll() {
		System.out.println("--------All device list--------");
		for(MobileDTO detail : dtos) {
			System.out.println(detail);
		}
		
	}

	@Override
	public MobileDTO deleteByMobileID(int mobileId) {
		boolean dltd = false;
		for(MobileDTO detail:dtos) {
			if(detail.getMobileID()==mobileId) {
				System.out.println("Deleted");
				dtos.remove(detail);
				dltd = true;
			}
		
		}
		if(!dltd) {
			throw new IdNotFoundException();
		}
		
		return null;
	}

	@Override
	public MobileDTO updateBySerialNumber(int oldNumber,int newNumber) {
		for(MobileDTO detail:dtos) {
			if(detail.getSerialNumber()==oldNumber) {
				detail.setSerialNumber(newNumber);
				
			}
			else {
				throw new SerialNumberNotFoundException();
			}
		}
		
		
		return null;
	}

	@Override
	public void getAllByBrandName(String brandName) {
		for(MobileDTO details:dtos) {
			if(details.getBrandName().equals(brandName)) {
				System.out.println(details);
				return;
			}
		}
		
		throw new BrandNameNotFoundException();
		
	}

}
