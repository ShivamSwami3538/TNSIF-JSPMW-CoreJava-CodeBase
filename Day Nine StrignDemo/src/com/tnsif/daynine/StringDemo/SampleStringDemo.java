package com.tnsif.daynine.StringDemo;

public class SampleStringDemo {

	public static void main(String[] args) {

		//initialise String
		
		char c[]= {'I', 'n','d','i','a'};
		
		String s1=new String(c);
		System.out.println(s1);
		
		String s2=new String (s1);
		System.out.println(s2);
		
		//concatenation to prevent long lines 
		
		String longstr="This is to show "+ 
		                " how long sentence "+ 
			           	"can be printed ";
		
		System.out.println(longstr);
		
	}

}