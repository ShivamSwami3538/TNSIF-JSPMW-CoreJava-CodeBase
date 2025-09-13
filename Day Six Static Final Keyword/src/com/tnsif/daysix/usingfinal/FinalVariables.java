package com.tnsif.daysix.usingfinal;

public class FinalVariables {
//    Find int x;  // not initialized not possible declare before 
	final int x = 100;
//	declare static blank final variable 1
	final static int y;
	final static int z = 10;
//	instance method
	void change() {
//		x=30;    cannnot change or reassign
//		z=100;   cannnot change or reassign
//		y=23;    not possible assign
		
	}
	@Override
	public String toString() {
		return "FinalVariables [x=" + x + ", y=" + y + "]";
	}
	
//	declare a static block 
	static {
//		z = 89;
		y = 20;
		System.out.println("Value of Y : " + y);
	}
	
//	static {        The final field y may already have been assigned
//		y = 987;
//	}
	
	
}
