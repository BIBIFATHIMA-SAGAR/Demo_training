package com.thoughtfocus.map;

import java.util.Map;
import java.util.TreeMap;

public class MobileDAO {
	Map<Integer,MobileDTO> map = new TreeMap<Integer,MobileDTO>();
	
	boolean save(Integer key,MobileDTO dto) {
		if(dto!=null) {
			map.put(key, dto);
			return true;
		}
		
		return false;
		
	}
	
	
	public void printByKey(Integer key) {
		if(!map.isEmpty() && map.containsKey(key)) {
			System.out.println("details are "+map.get(key));
			return;
		}
		System.out.println("details not found");
	}
		

	
	void deleteByKey(int key) {
		if(!map.isEmpty()) {
			if(map.containsKey(key)) {
				map.remove(key);
				return;
			}
		}else {
			System.out.println("map is empty");
		}
		
		throw new KeyNotFoundException();
		
	}
	
	MobileDTO updateByKey(int key, MobileDTO mobDto) {
		if(!map.isEmpty() && map.containsKey(key)) {
			map.remove(key);
			map.put(key, mobDto);
			return mobDto;
		}
		
		
		throw new KeyNotFoundException();
	}
	
	

}
