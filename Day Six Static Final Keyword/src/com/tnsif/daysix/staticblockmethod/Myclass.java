package com.tnsif.daysix.staticblockmethod;

public class Myclass {
	private int section; // Non Static variable or instance variable
	private static int srNo;
	// Static block
	static {
		System.out.println("---Within Static Block---");
		srNo = 1000;
//		section = 2000;     non Static		 
	}
	
	Myclass() {
		System.out.println("---Within Default Constructor---");
		srNo++;
		section++;
	}

	@Override
	public String toString() {
		return "Myclass [Serial No "+ srNo +", section = " + section + "]";
	}
	
//	Static Method()
	static void display() {
//		System.out.println("section: " + section); // error
		System.out.println("section: " + srNo); 
	}
	
}
