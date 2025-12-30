package com.tnsif.multithreading;

public class ChildThread extends Thread {  // java.lang.object
	private int n;
	private String msg;

public ChildThread (int n,String msg) {
	this.n=n;
	this.msg=msg;	
}
public void run() {
	for(int i=1;i<=n;i++) {
		try {
			Thread.sleep(300);
		}catch (InterruptedException e) {
			System.out.println("Thread interrupted:"+e.getMessage());
		}
		System.out.println(msg+i+""+Thread.currentThread().getName());
	}
}}
