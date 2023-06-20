package com.SeleniumProject.javaProgrames;

public class StarPrintingEg {

	public static void main(String[] args) {
		//Outer loop
		for (int i = 0; i < 5; i++)
		{
			//Inner loop
			for (int j = i; j >= 0; j--) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
