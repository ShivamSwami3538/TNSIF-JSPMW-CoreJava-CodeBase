package com.tnsif.dayfive.hierarchicalinheritancedemo;
// Hierarchical Inheritance - 2 child class inherit 1 base class

public class Person {
	String name;
	String city;
	
//	Non Parameterized Constructor  // Default Constructor
//	public Person() {
//		super();
//	}

	
//	Parameterized Constructor
//	public Person(String name, String city) {
//		super();
//		this.name = name;
//		this.city = city;
//	}
	
	public Person() {
		System.out.println("Person class default constructor");
		name = "Amit";
		city = "pune";
	}
	
	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

//	getter/setter mathod
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
// toString method
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}
	
}
