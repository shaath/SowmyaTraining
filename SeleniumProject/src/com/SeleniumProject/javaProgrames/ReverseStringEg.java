package com.SeleniumProject.javaProgrames;

public class ReverseStringEg {

	public static void main(String[] args) {
		
		String str = "malayalam";
//		String str = new String("malayalam");
//		String rev = "";
		
//		for(int i = str.length()-1; i >= 0; i--)
//		{
////			System.out.println(str.charAt(i));
//			rev = rev + str.charAt(i);   // muineleS
//		}
	
		StringBuffer br = new StringBuffer(str);
		StringBuffer rev = br.reverse();
		
		System.out.println(rev);
		
		if (str.equalsIgnoreCase(rev.toString())) {
			System.out.println("Given String is a polindrome");
		}else{
			System.out.println("Given String is not a polindrome");
		}

	}

}
