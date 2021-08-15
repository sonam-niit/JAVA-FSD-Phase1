package com.simplilearn.methods;

public class CallMethod {

	int val=200;
	
	int operation(int val) {
		this.val=val*10/100;
		return val;
	}
	
	public static void main(String[] args) {
		CallMethod call=new CallMethod();
		System.out.println("Before calling function "+call.val);
		call.operation(100);
		System.out.println("after calling function "+call.val);
	}
}
