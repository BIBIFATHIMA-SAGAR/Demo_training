package com.thoughtfocus.bank;

import com.thoughtfocus.bank.dao.*;
import com.thoughtfocus.bank.dto.AccountHolderDTO;
import com.thoughtfocus.bank.dto.AddressDTO;

public class Tester {

	public static void main(String[] args) {
		AccountHolderDAO dao = new AccountHolderDAO();
		AccountHolderDTO dto = new AccountHolderDTO();
		
		dto.setAccountNumber(2473649437l);
		dto.setName("Jack");
		dto.setContactNumber(234637426l);
		dto.setEmail("jack@abc.com");
		dto.setBalance(1000);
		dto.setiFSC("2342ab3");
		dto.setAdress(new AddressDTO("building1", "RRNagar","River","Dandeli","Karnataka","INDIA",1234));
		
		dao.save(dto);
		AccountHolderDTO dto1= new AccountHolderDTO();
		dto1.setAccountNumber(2823749437l);
		dto1.setName("John");
		dto1.setContactNumber(74756426l);
		dto1.setEmail("john@abc.com");
		dto1.setiFSC("2353xyz5");
		dto1.setBalance(500);
		dto1.setAdress(new AddressDTO("building2", "jayanagar","River","Banglore","Karnataka","INDIA",1234));
		dao.save(dto1);
		dao.printAll();
		
		
		System.out.println("------------");
		AccountHolderDTO dto2=dao.getByName("Jack");
		System.out.println("getting details by name "+dto2);

		System.out.println("----------------");
		System.out.println("updating by account number");
		dao.updateByAccountNumber(2823749437l,92638453427l);
		
		dao.printAll();
		
		System.out.println("-----------------------");
		long number = 74756426l;
		System.out.println("Deleted by number:"+number);
		System.out.println("-------------");
		dao.updatePincodeByArea("RRNagar", 2244);
		dao.printAll();
		System.out.println("--------------");
		dao.deleteByContactNumber(number);
		dao.printAll();
		
		dao.deposit(10000, 2473649437l);
		dao.withdraw(2473649437l, 4000);
		dao.printAll();

	}

}
