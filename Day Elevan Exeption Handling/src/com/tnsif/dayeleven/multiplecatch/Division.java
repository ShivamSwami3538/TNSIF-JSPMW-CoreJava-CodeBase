package com.tnsif.dayeleven.multiplecatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void divide()
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers : ");
		
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			System.out.println("Diviosn is "+ c);
		}
		catch(ArithmeticException e)
		{
			System.err.println(e.getMessage());
		}
		catch (InputMismatchException  e)
		{
			System.err.println(e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println(e.getMessage());
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
		}
		
		finally {
			sc.close();
			
			System.out.println("finally block ");
		}
		System.out.println("Statement after finally block ");
	}
	
	
	
}