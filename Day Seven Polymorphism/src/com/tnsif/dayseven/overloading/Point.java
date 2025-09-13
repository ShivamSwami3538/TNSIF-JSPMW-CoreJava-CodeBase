package com.tnsif.dayseven.overloading;

public class Point {

	private float x;
	private float y;
	
	//1 default constructor
	public Point() {
		
		x=0.0f;
		y=0.0f;
		
	}

	//2 constructor
	public Point(float x) {
		
		this.x = x;
		this.y=x;
		
	}

	//3 constructor
	public Point(float x, float y) {
	
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
	
	
	
}