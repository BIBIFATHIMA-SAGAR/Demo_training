package com.thoughtfocus.arrayassignment;

public class Week {
	String[] days = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
	int i = 0;
	
	public void printAll() {
		for(int i=0;i<days.length;i++) {
			if(days[i]!=null) {
				System.out.println(days[i]);
				
			}
			
		}
		
		
	}
//	public boolean save(String day) {
//		if(i<7) {
//			days[i]=day;
//			i++;
//			return true;
//			
//		}
//		else {
//			System.out.println("No Space");
//			return false;
//		}
//	}
	public String delete(String day) {
		for(int i=0;i<days.length;i++) {
			if(days[i].equals(day)) {
				days[i]=null;
			return day+" deleted ";
			}
			
		}
		
		return "day not deleted";
		
		
	}
	

}
