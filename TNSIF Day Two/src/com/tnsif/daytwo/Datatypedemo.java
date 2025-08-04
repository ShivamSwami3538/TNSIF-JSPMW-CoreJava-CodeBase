package com.tnsif.daytwo;

public class Datatypedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "S";
		String s2= "2";
		System.out.println(s1 + s2);
		
//		1 byte = 8 bits 
//		2 ^ 8 = 256 / 2 = +-128
//		0 is consider positive number not negative
//		0 to 127 select positive range 
//		-1 to -128 negative datatype range
		
//		Datatype - 2 types
//		1) Primitive  2) Non-Premitive
		
//		Premitive Datatypes 
//		1) Datatypes    2) memory
//           byte            1 byte
//           short           2 byte
//           int             4 byte
//           long            8 byte
//           float           4 byte
//           double          8 byte
//           char            2 byte
//           boolean         1 byte
		
		int value1 = 9/2;
		System.out.println(value1);
		
		float value2 = 100F/3F;
		System.out.println(value2);
		
		double value3 = 100d/3d;
		System.out.println(value3);
		
		int radius = 10;
		// assigning expression to variables
		double percentage = 3.14 * radius * radius;
		System.out.println("Print the area of circle: " + percentage);
	}

}
