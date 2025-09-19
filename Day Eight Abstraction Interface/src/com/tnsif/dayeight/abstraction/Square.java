package com.tnsif.dayeight.abstraction;

public class Square extends Shape {
	float side;

//	Default Constructor
	public Square() {
		side = 0.2f;
	}

//	Parameterized Constructor
	public Square(float side) {
		this.side = side;
	}

//	Square error implement method
	@Override
	public void CalArea() {
		// TODO Auto-generated method stub
		this.area = side*side;
	}
}
