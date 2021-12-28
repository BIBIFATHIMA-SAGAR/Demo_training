package com.thoughtfocus.collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
//		System.out.println(list);
		
		System.out.println(list.subList(0, 2));
		System.out.println("--------");
		Iterator<Integer> itr=list.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
		System.out.println("---------------------");
		
		System.out.println("size is:"+list.size());
		
		
		ArrayList<Integer> list1 =new ArrayList<>();
		
		
		list1.addAll(list);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		System.out.println(list1);
		
		list1.remove(5);
		System.out.println(list1);
		
		list1.removeAll(list);
		System.out.println(list1);
		System.out.println("---------------");
		System.out.println(list1.isEmpty());
		
		
		System.out.println(list1.contains(7));
		System.out.println("---------------");
		list1.clear();
		System.out.println(list1);
		
		
		
		
		

	}

}
