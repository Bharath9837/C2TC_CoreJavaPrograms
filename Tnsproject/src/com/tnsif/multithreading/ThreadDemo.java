package com.tnsif.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		ChildThread threadone= new ChildThread(5,"first");
		ChildThread threadtwo= new ChildThread(10,"second");
		threadone.start();
		threadtwo.start();
		System.out.println("---------------------------------"+"End of Main--------------------"+"------------");
	}

}
