package com.simplilearn.sync;

public class Sender {

	public void send(String msg) {
		System.out.println("Sending\t "+msg);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println(msg+" sent successfully");
	}
}
