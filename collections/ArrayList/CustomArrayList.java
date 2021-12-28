package com.thoughtfocus.collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomArrayList {

	public static void main(String[] args) {
		
		ArrayList<Schools> schoolList = new ArrayList<>();
		
		Schools jss = new Schools("jss", 80, "j01", "Dharwad");
		Schools convent = new Schools("convent", 100, "c01", "Dandeli");
		Schools rotary = new Schools("rotary", 90, "r01", "Haliyal");
		Schools basel = new Schools("BasselMission", 80, "b01", "Hubli");
		
		schoolList.add(jss);
		schoolList.add(convent);
		schoolList.add(rotary);
		schoolList.add(basel);
		
//		System.out.println(schoolList);
		
//		Iterator<Schools> itr = schoolList.iterator();
//		
//		while(itr.hasNext()) {
//			
//			Schools school = itr.next();
//			if(school.getNoOfStudent()<100) {
//				System.out.println(school);
//			}
//		}
		
		for(Schools school:schoolList) {
			if(school.getNoOfStudent()<100) {
				System.out.println(school);
		}
		}
		
		
		

	}

}
