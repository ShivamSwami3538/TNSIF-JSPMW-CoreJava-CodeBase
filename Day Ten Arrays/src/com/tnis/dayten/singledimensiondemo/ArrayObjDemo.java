package com.tnis.dayten.singledimensiondemo;

public class ArrayObjDemo {

	public static void main(String[] args) {
		
		Student []arr;
		
		//declare memory for 5 obj of type students 
		
		arr=new Student[5];
		
		arr[0]=new Student(1, "Shubham");
		arr[1]=new Student(2, "Heti");
		arr[2]=new Student(3, "Aditya");
		arr[3]=new Student(4, "Zeel");
		arr[4]=new Student(5, "Simran");
		//arr[5]=new Student(6, "Manoj");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Elements at"+ i + ":"+
		arr[i].getRollNo()+" "+ arr[i].getName());
		}
	}

}