package com.simplilearn.sync;

public class ThreadSend implements Runnable{

	private String msg;
	Sender sender;
	
	public ThreadSend(Sender sender,String msg) {
		
		this.sender=sender;
		this.msg=msg;
	}
	
	@Override
	public void run() {
		synchronized (sender) {
			sender.send(msg);
		}
		
	}
}
