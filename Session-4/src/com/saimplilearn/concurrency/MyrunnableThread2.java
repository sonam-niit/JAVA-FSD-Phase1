package com.saimplilearn.concurrency;

import javax.swing.plaf.SliderUI;

public class MyrunnableThread2 implements Runnable {

	public static int myCount=0;
	public MyrunnableThread2() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		
		while(myCount<=10) {
			try {
				System.out.println("New Thread "+ ++myCount);
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}

	}
	public static void main(String[] args) {
		Thread t1=new Thread(new MyrunnableThread2());
		
		t1.start();
		
		while(MyrunnableThread2.myCount<=10) {
			try {
			System.out.println("Main Thread: "+ ++MyrunnableThread2.myCount);
			Thread.sleep(100);
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("end of Main Thread");
	}

}
