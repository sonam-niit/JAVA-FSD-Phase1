package com.saimplilearn.concurrency;

public class MyClass {

	private static Object student1=new Student();
	
	public static void main(String[] args) throws InterruptedException{
		
		Thread.sleep(2000);
		
		System.out.println("Thread "+Thread.currentThread().getName()+" is woke up after 1 s of sleep");
		
		synchronized (student1) {
			
			student1.wait(2000);
			System.out.println("Object "+student1+" is woken up after 2 s of wait");
		}
	}
}
