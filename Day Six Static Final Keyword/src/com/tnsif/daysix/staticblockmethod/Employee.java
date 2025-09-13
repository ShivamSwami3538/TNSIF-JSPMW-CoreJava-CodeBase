package com.tnsif.daysix.staticblockmethod;

public class Employee {
//	declare instance variables
	private String name;
	private int id;
//	declare a static variables company name with data type static 
//	TNS which is common for all the object 
	static String companyName = "TNS";
	
public Employee(String name, int id) {
	this.name = name;
	this.id = id;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ",company=" + companyName + "]";
}
	
}
