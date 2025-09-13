package com.tnsif.dayseven.overloading;

public class OverloadingDemo {

	public static void main(String[] args) {
		
		System.out.println("---Constructor Overloading------");
		
		Point p =new Point(2.3f,34.56f);
		System.out.println(p);
		
		System.out.println("--Method Overloading--");
		System.out.println("Addition of two integer "+ MethodOverloadingDemo.addition(5, 100));
		System.out.println("Addition of two String "+ MethodOverloadingDemo.addition("Shubham ", "Dhangar"));
		
		System.out.println(MethodOverloadingDemo.addition(2, 2, 2));
		
		
	}

}