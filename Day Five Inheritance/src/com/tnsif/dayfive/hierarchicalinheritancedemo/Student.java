package com.tnsif.dayfive.hierarchicalinheritancedemo;
//Hierarchical Inheritance - 2 child class inherit 1 base class

public class Student extends Person{
	
	private String Clas; // CLASS, Class
	private float percent;
	
//	non Parameterized constructor  // Default Constructor
	public Student() {
		System.out.println("Student class default constructor");
		Clas = "FY";
		percent = 75f;
//		super();
	}
	
//	parameterized constructor
	
//	public Student(String class1, float percent) {
//		super();
//		Class = class1;
//		this.percent = percent;
//	}
	
	public Student(String name, String city, String Clas, float percent) {
		super(name, city);
		this.Clas = Clas;
		this.percent = percent;
	}

//	getter/setter method
	public String getClas() {
		return Clas;
	}

	public void setClas(String clas) {
		Clas = clas;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

//	tostring method
	@Override
	public String toString() {
		return "Student [Clas=" + Clas + ", percent=" + percent + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}	
	
}
