package com.SeleniumProject.javaProgrames;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEg {

	public static void main(String[] args) {
		
		Set<Object> s = new HashSet<>();
		
		s.add("Apple");
		s.add("Boll");
		s.add("Cat");
		s.add(15000);
		s.add("Selenium");
		s.add("Manual");
		s.add("Apple");
		
//		System.out.println(s.size());
		
//		Iterator<Object> it = s.iterator();
//		
//		while(it.hasNext())
//		{
//			Object value = it.next();
//			System.out.println(value);
//		}
		
		for (Object value : s) {
			System.out.println(value);
			
		}

	}

}
