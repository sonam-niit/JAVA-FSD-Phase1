package com.simplilearn.sync;

public class SyncMain {

	public static void main(String[] args) {
		

		//common sender object
		Sender send=new Sender();
		
		ThreadSend s1=new ThreadSend(send, "Hello");
		
		ThreadSend s2=new ThreadSend(send, "Good Morning");
		
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		t2.start();
	}
}
