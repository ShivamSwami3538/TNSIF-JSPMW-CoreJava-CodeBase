package com.tnsif.daysix.staticblockmethod;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Create the first object of the class
//		Employee e1 = new Employee("Shubham",1001);
//		System.out.println(e1);
	
// Dynamic memory allocation
	Employee e1;    
	e1 = new Employee("Shubham",1001);
	System.out.println(e1);
	
	e1 = new Employee("Aditya",1002);
	System.out.println(e1);
	
	e1 = new Employee("Abhi",1003);
	System.out.println(e1);
	}
}
