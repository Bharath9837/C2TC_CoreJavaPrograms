package com.tnsif.oops.abstraction;

public class Square extends Shape {
	private float side;
	public Square()
	{
		side = 3.5f;
	}
	public Square(float side) 
	{
		this.side=side;
	}
	@Override
	void calArea() {
		super.area=side*side;
	}
}
