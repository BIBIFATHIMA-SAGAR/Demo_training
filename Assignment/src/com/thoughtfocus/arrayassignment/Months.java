package com.thoughtfocus.arrayassignment;

public class Months {
	private String[] months = new String[12];
	private int index=0;
	
	public void printAll() {
		for(int index=0;index<months.length;index++) {
			if(months[index]!=null) {
				System.out.println(months[index]);
				
			}
			
		} 
	}
	public boolean save(String month) {
		if(index<12) {
			months[index] = month;
			index++;
			return true;
			
		}
		else {
			System.out.println("No space");
			return false;
		}	
	}
	public void delete(String month) {
		for(int index=0;index<months.length;index++) {
			if(months[index].equals(month)) {
				months[index]= month+" deleted";
//				return month+ deleted successfully";
			}
		}
//		return "month not deleted";
	}
	
	public String update(String oldName, String newName) {
		for(int index=0;index<months.length;index++) {
			if(months[index].equals(oldName)) {
				months[index]=newName;
				return oldName+" updated to "+newName;
			}
		}
		return "name not updated";
	}
	
	}

