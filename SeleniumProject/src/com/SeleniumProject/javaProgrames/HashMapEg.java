package com.SeleniumProject.javaProgrames;

import java.util.HashMap;
import java.util.Map;

public class HashMapEg {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("Siva", 45);
		map.put("Paravathi", 40);
		map.put("Sowmya", 32);
		map.put("Arshad", 10);
		map.put("Ashwaz", 5);
		
		
		System.out.println(map.size());

//		System.out.println(map.get("Sowmya"));
		
//		System.out.println(map);
		
//		if (map.containsKey("Arshad")) {
//			System.out.println(map.get("Arshad"));
//		}
		
		for(Map.Entry m: map.entrySet()){
			
			System.out.println(m.getKey() + "----" + m.getValue());
		}
	}
	

}
