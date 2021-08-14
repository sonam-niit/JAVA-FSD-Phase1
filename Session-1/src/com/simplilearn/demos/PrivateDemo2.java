package com.simplilearn.demos;

public class PrivateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivateDemo demo=new PrivateDemo();
		//private variables are not visible outside of class//
		//uncomment the below line and check error
		//System.out.println(demo.x);
		
		//protected variable accessible to same package
		System.out.println(demo.y);
		//default accessible to same package
		System.out.println(demo.z);
	}

}
