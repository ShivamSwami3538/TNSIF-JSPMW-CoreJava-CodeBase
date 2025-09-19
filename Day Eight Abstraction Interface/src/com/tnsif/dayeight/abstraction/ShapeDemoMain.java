package com.tnsif.dayeight.abstraction;

public class ShapeDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		
		s = new Square(5.0f);
		s.CalArea();
		s.show();
		
		s = new Rectangular(5,4);
		s.CalArea();
		s.show();
		
		s = new Circle(5);
		s.CalArea();
		s.show();
	}
}
