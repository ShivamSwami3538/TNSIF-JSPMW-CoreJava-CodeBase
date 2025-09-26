package com.tnsif.dayeight.interfacedemo;

public class Bankdemo {
	public static void main (String[] args) {
		SavingAccount s1 = new SavingAccount("Shweta", "Pune", 12345, 37000f);
		
		s1.deposit(26000);
		System.out.println(s1);
		
		s1.withdraw(25000);
		System.out.println(s1);
		
		s1.withdraw(9000);
		System.out.println(s1);
		
		s1.withdraw(5000);
		System.out.println(s1);
	}
}
