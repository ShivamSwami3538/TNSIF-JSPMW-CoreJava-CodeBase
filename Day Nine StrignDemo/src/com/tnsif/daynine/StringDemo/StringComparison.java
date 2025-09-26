package com.tnsif.daynine.StringDemo;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="A";
		String s2="a";
		
		
		String s3=new String ("TNSIF");
		String s4=new String ("TNSIF");
		
		//==  Equals
		
		//== --> Object reference 
		//equals --> data
		
		System.out.println("Case 1 : "+ (s1==s2)); //true
		System.out.println("Case 2 : "+ (s1==s3)); // false
		System.out.println("Case 3 : "+ (s2.equals(s1))); //true
		System.out.println("Case 4 : "+ (s2.equals(s4))); //true
		System.out.println("Case 5 : "+ (s3==s4)); //false
		System.out.println("Case 6 : "+ (s3.equals(s4))); //true
		
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		//compareTo s1== TNSIF compare to TNSIF
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}