package com.simplilearn.accessspecifier;

import com.simplilearn.demos.PrivateDemo;

public class Child extends PrivateDemo{
	
	public void printProtected()
	{
		System.out.println(y);
	}

	public static void main(String[] args) {
		Child c=new Child();
		c.printProtected();
	}
}
