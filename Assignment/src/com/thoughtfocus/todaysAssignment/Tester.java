package com.thoughtfocus.todaysAssignment;

public class Tester {
	public static void main(String[] args) {
		TraineeDetails details = new TraineeDetails();
		details.setId(106582);
		details.setName("Tom");
		details.setNumber(298374862);
		
		TraineeDetails details1 = new TraineeDetails();
		details1.setId(106583);
		details1.setName("Jerry");
		details1.setNumber(923234223);
		
		TraineeDetails details2 = new TraineeDetails();
		details2.setId(106584);
		details2.setName("Mickey");
		details2.setNumber(623742213);
		
		TraineeDAO dao = new TraineeDAO();
		
		dao.save(details);	
		dao.save(details1);
		dao.save(details2);
		
		dao.printAll();
		System.out.println(dao.deletebyName("Jerry"));
		System.out.println(dao.deletebyId(106582));
//		System.out.println("---------------------");
		dao.printAll();
		
		TraineeDetails updateDetails = new TraineeDetails();
		updateDetails.setId(106584);
		updateDetails.setName("Dora");
		updateDetails.setNumber(28974628);
		System.out.println(dao.updateById(updateDetails.getId(), updateDetails));
		dao.printAll();
		
		
		
		
		
		
	}

}
