package com.tnsif.dayfive.scanner;

public class Person {
	// data members
	private String name;
	private int income;
	private int age;
	private String gender;
	private int tax;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", income=" + income + ", age=" + age + ", gender=" + gender + ", tax=" + tax
				+ "]";
	}
	
//	@override
//	public String toString() {
//		return "Person";
//	}
	
	
	
}
