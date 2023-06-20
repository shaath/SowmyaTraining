package com.Practiceproject.testNGExamples;

import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotaionsEg {
	
	@Test(priority = 0)
	public void Function1(){
		System.out.println("This is Function1 code");
	}
	
	@Test(priority = 1)
	public void Function2(){
		System.out.println("This is Function2 code");
	}
	
	@Test(priority = 2)
	public void Function3(){
		System.out.println("This is Function3 code");
//		throw new SkipException("This method implementation not yet done");
	}
	
	@Test(priority = 3)
	public void Apple(){
		System.out.println("This is Apple code");
	}
	
	@BeforeMethod
	public void bm(){
		System.out.println("This is Before Method code");
	}
	
	@AfterMethod
	public void am(){
		System.out.println("This is After method");
	}
	
	@BeforeClass
	public void bc(){
		System.out.println("This is Before class");
	}
	
	@AfterClass
	public void ac(){
		System.out.println("This is After class");
	}
	
	@BeforeTest
	public void bt(){
		System.out.println("This is Before Test");
	}
	
	@AfterTest
	public void at(){
		System.out.println("This is After Test");
	}
}

