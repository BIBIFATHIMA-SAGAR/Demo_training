package com.thoughtfocus.exception.customexception.unchecked;

import java.util.Arrays;

public class DMart {
	String[] items = {"sugar","chocolate","rice","carrot"};
	
	
	void searchItem(String item) 
	
	{
		if(Arrays.binarySearch(items, item)>=0) 
		{
			System.out.println("Item is available");
		}
		
		else {
			DmartException dmartException = new DmartException();
			throw dmartException;
			
		}
	}
	
}
