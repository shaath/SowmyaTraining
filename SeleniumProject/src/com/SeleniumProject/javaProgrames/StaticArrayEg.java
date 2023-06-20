package com.SeleniumProject.javaProgrames;

public class StaticArrayEg {

	public static void main(String[] args) {
		
		int[] arrSalary = {10000, 20000, 30000, 40000, 50000, 60000, 70000};

		System.out.println(arrSalary.length);
		
//		System.out.println(arrSalary[3]);
//		
//		for(int i = 0; i < arrSalary.length; i++)
//		{
//			System.out.println(arrSalary[i]);
//		}
		
		for(int data: arrSalary)
		{
			System.out.println(data);
		}
		
		
	}

}
