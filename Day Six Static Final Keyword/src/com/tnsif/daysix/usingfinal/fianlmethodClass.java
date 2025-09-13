package com.tnsif.daysix.usingfinal;

public class fianlmethodClass {
// constructor      default constructor
	public fianlmethodClass() {
		System.out.println("This is a default constructor");
	}
	final int a = 50;    // non static 
	// final method 
//	final void show() {                   // method declare
//		System.out.println("Value of a:" + a);
//	}
	 void show() {                   // method declare
		System.out.println("Value of a:" + a);
	}

}
