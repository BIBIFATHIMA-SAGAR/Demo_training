package com.thoughtfocus.collections.TreeSetUsingStringBuffer;

import java.util.Comparator;

public class BufferComparator implements Comparator<StringBuffer> {

	@Override
	public int compare(StringBuffer name1, StringBuffer name2) {
		if(name1.length()<name2.length()) {
			return -1;
		}
		else if(name1.length()>name2.length()) {
			return 1;
			
		}
		else {
			return 0;
		
		}
		
	}

}
