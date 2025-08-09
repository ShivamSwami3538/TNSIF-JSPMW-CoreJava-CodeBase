package com.tnsif.dayfive.scanner;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner class
		// Scanner object to accept user Inputs
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Person Name:");
		String name = obj.next();
		
		System.out.println("Enter Age:");
		int age = obj.nextInt();
		
		System.out.println("Enter Gender:");
		String gender = obj.next();
		
		System.out.println("Enter Income:");
		int income = obj.nextInt();
		
		// Person class obect & initialize values using
		Person person = new Person();
		
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person.getAge());
		System.out.println(person.getGender());
		
		//display person details using toString() method
		System.out.println(person);
		
		TaxCalculation calc = new TaxCalculation();
		calc.calculateTax(person);  // tax calculate
		System.out.println("After Calculation of Tax:");
		System.out.println(person);
	}

}
