package com.tnsif.daynine.StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer buffer=new StringBuffer("Hello");
		System.out.println("Buffer = "+ buffer );
		
		System.out.println("Lenght= "+buffer.length());
		System.out.println("Capacity ="+ buffer.capacity()); // imp 16 cap
		
		//appending and inserting into buffer
		String s;
		int a=42;
		buffer=new StringBuffer(40);
		s=buffer.append("a =").append(a).append("!").toString();
		System.out.println(s);
		
		buffer=new StringBuffer("I Java !");
		
		System.out.println(buffer );
		
		buffer.insert(2, " like ");
		System.out.println(buffer);
		
		buffer.delete(3, 6);
		System.out.println(buffer);
		
		System.out.println(buffer.replace(1, 3, "AAA"));
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
		

	}

}