package com.SeleniumProject.javaProgrames;

public class NestedIfEg {

	public static void main(String[] args) {
		
		int a = 500;
		int b = 110;
		int c = 500;
		
		if(a > b && a > c)
		{
			System.out.println("A is Greater");
		}
		else if(b > a && b > c)
		{
			System.out.println("B is Greater");
		}
		else if(c > a && c > b)
		{
			System.out.println("C is Greater");
		}
		else
		{
			System.out.println("Avoid Duplicates");
		}

	}

}
