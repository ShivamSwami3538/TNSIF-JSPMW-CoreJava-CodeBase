package com.tnsif.dayeight.abstraction;

public abstract class Shape {
	protected float area;
//	abstract method
	public abstract void CalArea();
	
//	Solid method
	public void show() {
		System.out.println("Area of the shape is : " + area);
	}
}
