package com.tnsif.dayseven.overriding;

//parent class
class Colour {
	
	protected Colour getColour() {
		Colour s=new Colour();
		return s;
	}
}

//child class
class Yellow extends Colour {
	
	
	protected Yellow getColour()
	{
		Yellow s=new Yellow ();
		return s;
	}
}

public class CovarientOverRiding {

	public static void main(String[] args) {
		
		Colour c=new Colour();
		System.out.println(c.getColour());
		
		Yellow y=new Yellow();
		System.out.println(y);

	}

}