package com.tnsif.daythree;

public class Ifdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Output is not coming
		int x = 9;
		if(x == 5) {
			System.out.println("Value of x is 5");
		}
		
		int x1 = 9;
		if(x1 <= 5) {
			System.out.println("Value of x is 5");
		}
		
		// getting output
		int x2 = 5;
		if(x2 <= 5) {
			System.out.println("Value of x is 5");
		}
		
		int age = 6;
		if(age >= 18) {
			System.out.println("Eligible for Voting.");
		}
		
		int age1 = 66;
		if(age1 >= 18) {
			System.out.println("Eligible for Voting.");
		}	
		
	}

}
