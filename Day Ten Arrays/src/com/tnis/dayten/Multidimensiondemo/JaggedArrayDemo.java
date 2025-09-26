package com.tnis.dayten.Multidimensiondemo;



class JaggedArray{
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


public class JaggedArrayDemo {

	public static void main(String[] args) {
	
	int c[][]= { {10,20,30,40},{1},{1,2,3,4,5,6},{7,9},{23,44}};
	System.out.println("Total Row in array "+ c.length);
	
	JaggedArray.printArray(c);
	}

}