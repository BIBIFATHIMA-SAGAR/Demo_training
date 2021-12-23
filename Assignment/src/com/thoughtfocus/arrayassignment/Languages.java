package com.thoughtfocus.arrayassignment;

public class Languages {
	String[] languages = new String[15];
	int index =0;
	
	
	public void printAll() {
		for(int index = 0;index<languages.length;index++) {
			if(languages[index]!=null) {
				System.out.println(languages[index]);
			}
		}
	}
	public boolean save(String language) {
		
			if(index<15) {
				languages[index]=language;
				index++;
				return true;
			}
			else {
				System.out.println("no space");
				return false;
			}
		
		
		
	}
	public String delete(String language) {
		for(int index=0;index<languages.length;index++) {
			if(languages[index].equals(language)) {
				languages[index]=null;
			return language+" deleted successfully";	
			}
		}
		return "not deleted";
		
	}

}