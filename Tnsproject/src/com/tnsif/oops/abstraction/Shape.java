package com.tnsif.oops.abstraction;

public abstract class Shape {
	protected float area;
	
	abstract void calArea();
	
	void show()
	{
		System.out.println("Area Of The Shape Is "+area);
	}
	
}
