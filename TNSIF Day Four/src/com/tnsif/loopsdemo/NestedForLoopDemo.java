package com.tnsif.loopsdemo;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Program to print the multiplication of tables
//		int beg=10;
//		int end=20;
		
		int beg=5;
		int end=7;
		
		for(int i=beg; i<=end; i++)
		{
			for(int j=1; j<=10; j++)
			{
//				System.out.println(i*j);          //  only multiplication Print
				System.out.println(i + " * " + j + " = " + i*j);       // perticular structural/basic format of table print
				
			}
			System.out.println();
		}
		
	}

}
