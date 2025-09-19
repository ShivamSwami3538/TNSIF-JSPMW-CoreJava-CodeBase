package com.tnsif.dayeight.abstraction;

public class Rectangular extends Shape {
	float width;
	float height;
	
//  Default constructor
	public Rectangular() {
		width = 3.2f;
		height = 3.2f;	
	}

//	Parameterized constructor
	public Rectangular(float width, float height) {	
		this.width = width;
		this.height = height;
	}
	
//	Rectangular error implement method
	@Override
	public void CalArea() {
		// TODO Auto-generated method stub
		this.area  = width*height;
	}
	
}
