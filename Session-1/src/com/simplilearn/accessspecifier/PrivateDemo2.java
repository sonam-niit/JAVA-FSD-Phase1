package com.simplilearn.accessspecifier;

import com.simplilearn.demos.PrivateDemo;

public class PrivateDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrivateDemo demo=new PrivateDemo();
		//private variables are not visible to another package//
		//uncomment the below line and check error
		//System.out.println(demo.x);
		
		//protected variable is not accessible to another package
		//System.out.println(demo.y);
		//default variable is not accessible to another package
		//System.out.println(demo.z);
	}

}
