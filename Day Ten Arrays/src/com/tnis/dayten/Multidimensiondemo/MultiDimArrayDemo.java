package com.tnis.dayten.Multidimensiondemo;


class MLArray
{
	static void printArray(int c[][])
	{
		System.out.println("Array Elemets are as follow :");
		for(int i=0; i<c.length; i++)  // rows
		{
			for(int j=0; j<c[i].length; j++)  //columns
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class MultiDimArrayDemo {

	public static void main(String[] args) {
		int c[][]= { {12,24} , {10,20}, {1,2} , {100,200} ,{3,4},  {5,6}};  // new int [6][2];
		
		System.out.println("No of row in C array : "+c.length);
		
		MLArray.printArray(c);

	}

}