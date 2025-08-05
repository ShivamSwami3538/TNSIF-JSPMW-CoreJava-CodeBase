package com.tnsif.loopsdemo;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30,40,50,60};
//		single Row Format array 10 format
//		for integer array
		for(int i:a) 
		{
			// Below two give same output
//			System.out.println(i);      // print output in column format
//			System.out.println(i+ " ");    // print output in column format  
			
			System.out.print(i+ " ");    // print output in row format
//			System.out.print(i+ "\t");    // print output in row format in 6 line spacing
		}
		
		System.out.println();    // to print the below condition to next line
		
		char ch [] = {'j','a','v','a'};
		for(char c: ch)
//			System.out.print(c);        // print without space in word
		    System.out.print(c+ " ");
	}

}
