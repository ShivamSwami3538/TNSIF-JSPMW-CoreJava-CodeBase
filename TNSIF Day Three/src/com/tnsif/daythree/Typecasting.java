package com.tnsif.daythree;

public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// widening    // implicit typecasting
		 byte b = 10;
		 int l = b;
		 System.out.println(l);

		 float F = 22.14F;
		 double d = F;
		 System.out.println(d);
		 
		 char ch = 'A';
		 int i = ch;
		 System.out.println(i);
		 
		 // Narrowing datatype  // explicit typecasting 
		 double F1 = 10.52F;
		 long ll = (long) F1;
		 System.out.println(ll);
		 
		 int i2 = 130;
		 byte b1 = (byte) i2;
		 System.out.println(b1);
		 
		 long i3 = 8668525992l;
		 int b2 = (int) i3;
		 System.out.println(b2);
	}

}
