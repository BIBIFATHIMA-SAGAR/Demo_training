package com.thoughtfocus.bank.dao;

import java.util.ArrayList;


import java.util.List;

import com.thoughtfocus.bank.dto.AccountHolderDTO;
import com.thoughtfocus.bank.dto.AddressDTO;


public class AccountHolderDAO {
	private List<AccountHolderDTO> dtos = new ArrayList<AccountHolderDTO>();
	
	
	
	public String save(AccountHolderDTO dto) {
		boolean isSaved =dtos.add(dto);
		if(isSaved) {
			return "Data saved";
		}
		else {
			return "Data not saved";
		}
		
		
	}
	public void printAll() {
		for(int index=0;index<dtos.size();index++) {
			System.out.println(dtos.get(index));
			
		}
	}
	
	public AccountHolderDTO getByName(String name) {
		for(int index=0;index<dtos.size();index++) {
			if(dtos.get(index).getName().equals(name)){
//				System.out.println(dtos.get(index));
				return dtos.get(index);
				 
				
			}
		}
		return null;
	}
	
	
	public AccountHolderDTO updateByAccountNumber(long oldNumber,long newNumber) {
		for(int index=0;index<dtos.size();index++) {
			if(dtos.get(index).getAccountNumber()==oldNumber) {
				dtos.get(index).setAccountNumber(newNumber);
				return dtos.get(index);
			}
		}
		return null;
	}
	
	
	public AccountHolderDTO deleteByContactNumber(long number) {
		for(int index=0;index<dtos.size();index++) {
			if(dtos.get(index).getContactNumber()==number) {
				dtos.remove(index);
				
				
			}
			
		}
		return null;
		
	}
	
	public AccountHolderDTO updatePincodeByArea(String area,int pincode) {
		for(int index=0;index<dtos.size();index++) {
			if(dtos.get(index).getAdress().getArea().equals(area)) {
				 dtos.get(index).getAdress().setPincode(pincode);
				 return dtos.get(index);
			}
		}
		
		return null;
		
	}
	
	public float getCurrentBalance(long accountNumber) {
		
		for(int index=0;index<dtos.size();index++) {
			if(dtos.get(index).getAccountNumber()==accountNumber) {
				dtos.get(index).getBalance();
			
				
				
			}
		}
		return 0 ;
	}
	
	
	public float deposit(float amount,long accountNo) {
		for (int index=0;index<dtos.size();index++) {
			if(dtos.get(index).getAccountNumber() == accountNo) {
				float bal = dtos.get(index).getBalance();
				dtos.get(index).setBalance(bal+amount);
				System.out.println("Deposited Rs."+amount);
				return dtos.get(index).getBalance();
			}else {
				//acc not found

				System.out.println("Invalid account number");
			}
		}
		
		return 0.0f;
		
	}
	
	public float withdraw( long accountNo,float amount) {
		if(amount>1000) {
			for (int index=0;index<dtos.size();index++) {
				if(dtos.get(index).getAccountNumber() == accountNo) {
					float bal = dtos.get(index).getBalance();
					if(amount < bal) {
						dtos.get(index).setBalance(bal-amount);
						System.out.println("Withdraw successful "+amount);
						return amount;
					}else {
						System.out.println("insufficient bal");
					}
				}else {
					System.out.println("invalid acc num"); 
				}
			}
		}
		else {
			System.out.println("cannot withdraw less than 1000 "); 
		}
		
		return 0.0f;
	}
	
}
