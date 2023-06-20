package com.SeleniumProject.javaProgrames;

import java.util.Scanner;

public class MethodsReuseEg {

	public static void main(String[] args) {
		
//		MethodsEg.Function1();
		MethodsEg me = new MethodsEg();
		
//		boolean flag= me.Function4();
//		System.out.println(flag);
		
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
		
//		int res = me.sum(50, 30);
//		System.out.println(res);
//		
//		res = me.sum(20, 30, 20);
//		System.out.println(res);
		
		SampleConstructor sc = new SampleConstructor();
		
		SampleConstructor sc1 = new SampleConstructor(20, "Constructor");
	}

}
