package com.tnsif.dayfive.hierarchicalinheritancedemo;
//Hierarchical Inheritance - 2 child class inherit 1 base class

public class HierarchicalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		System.out.println(p1);
		
		Person p;
		p=new Person("Shubham", "Pune");
		System.out.println(p);
		
		p=new Employee("Nikita","Nashik",1002,123456,"QA");
		System.out.println(p);
		
		p=new Student("Aditya","Mumbai","TY",12345f);
		System.out.println(p);
	}

}
