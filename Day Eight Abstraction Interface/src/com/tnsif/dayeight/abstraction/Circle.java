package com.tnsif.dayeight.abstraction;

public class Circle extends Shape {
    float radius;

    // Default Constructor
    public Circle() {
        radius = 1.0f;
    }

    // Parameterized Constructor
    public Circle(float radius) {
        this.radius = radius;
    }

    // Implementing abstract method to calculate area
    @Override
    public void CalArea() {
        this.area = (float) (Math.PI * radius * radius);
    }
}
