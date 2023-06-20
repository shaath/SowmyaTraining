package com.SeleniumProject.javaProgrames;

public class ForEg {

	public static void main(String[] args) {
			//Initialization; Condition; Incrementor
//		for(int i = 1; i <= 10; i++)
//		{
//			System.out.println("Hi");
//		}
		//Incrementor Loop
		for(int i = 1; i <= 100; i++)
		{
			System.out.println(i);
			if(i == 75)
			{
				break;
			}
		}
		
		System.out.println("*******************");
		//Decrementor Loop
		
		for(int i = 100; i >= 1; i--)
		{
			System.out.println(i);
			if (i == 45) {
				break;
			}
		}
		
	}

}
