package com.SeleniumProject.javaProgrames;

public class DynamicArrayEg {

	public static void main(String[] args) {
		
		Object[] arrData = new Object[5];
		
		System.out.println(arrData.length);

		arrData[1] = "Selenium";
		arrData[3] = 50000;
		arrData[1] = "Java";
		
		System.out.println(arrData[1]);
//		for (Object data : arrData) {
//			System.out.println(data);
//		}
		
	}

}
