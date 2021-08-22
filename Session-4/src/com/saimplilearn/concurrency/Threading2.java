package com.saimplilearn.concurrency;

public class Threading2 implements Runnable{

	public void run() {
		System.out.println("My Thread started using runnable");
	}
	
	public static void main(String[] args) {
		
		Runnable r=new Threading2();
		Thread t1=new Thread(r);
		t1.start();
	}
	
}
