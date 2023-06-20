package com.SeleniumProject.javaProgrames;

public class ObjectEg {

	public static void main(String[] args) {
		Object[] x = {40000, 3235.35325, "Sowmya", 'M', true};
		
		System.out.println(x.length);

		for(Object data : x){
			System.out.println(data);
		}
	}

}
