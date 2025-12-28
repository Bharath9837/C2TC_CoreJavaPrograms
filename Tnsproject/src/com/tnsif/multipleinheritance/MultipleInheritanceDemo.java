package com.tnsif.multipleinheritance;
interface Bike {
	void show();
}
interface Car {
	void run();
}

class Truck implements Bike,Car{
	@Override
	public void show() {
		System.out.println("this is a Bike");
	}
	
	@Override
	public void run() {
		System.out.println("This is a Car");
	}
}
public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		Truck obj1 = new Truck();
		obj1.show();
		obj1.run();
	}
}
