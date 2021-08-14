package com.simplilearn.demos;

public class PrivateDemo {

	private int x=20;
	protected int y=60;
	int z=70;//default variable
	public static void main(String[] args) {
		PrivateDemo demo=new PrivateDemo();
		System.out.println(demo.x);
		System.out.println(demo.y);
	}
}
