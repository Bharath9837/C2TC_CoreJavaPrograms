package com.tnsif.oops.polymorphism.overriding.v1;

public class ShapeDemo {

	public static void main(String[] args) {
		// Create an array of Shape objects
		Shape[] shapes = new Shape[3];

		// Instantiate objects of Circle, Triangle, and Square
		shapes[0] = new Circle(7.5);
		shapes[1] = new Triangle(3.5, 4.5);
		shapes[2] = new Square(8.0);

		// Demonstrate polymorphism by calling draw and erase methods
		for (Shape shape : shapes) {
			shape.draw();
			shape.erase();
			System.out.println("----------------------"); 
		}
	}

}
