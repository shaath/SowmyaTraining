package com.SeleniumProject.javaProgrames;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {

	public static void main(String[] args) {
		
		List<Object> al = new ArrayList<>();
		
		al.add("Selenium");
		al.add(50000);
		al.add(3242334.343);
		al.add(true);
		al.add('M');
		al.add("Apple");
		al.add(2, "UFT");
		
		al.set(6, "Sowmya");
		al.add("Selenium");
//		List<Object> x = al.subList(2, 6);
		
//		al.clear();
//		al.remove(2);
//		System.out.println(al.isEmpty());
//		System.out.println(al.indexOf("Apple"));
//		System.out.println(al.contains("50000"));
//		System.out.println(al.size());
		System.out.println(al.lastIndexOf("Selenium"));
		
//		System.out.println(al.get(3));
		
		for(Object sowmya: al)
		{
			System.out.println(sowmya);
		}

	}

}
