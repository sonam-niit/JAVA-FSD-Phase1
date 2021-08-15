package com.simplilearn.methods;

public class MethodDemo {

	public void print()
	{
		System.out.println("Hello World");
	}
	
	public int cube(int n) {
	
		int result=n*n*n;
		return result;
	}
	
	public static void main(String[] sonam) {
		MethodDemo obj=new MethodDemo();
		obj.print();
		
		int value=obj.cube(5);
		System.out.println("Cube of 5: "+value);
		
		System.out.println("Cube of 6: "+obj.cube(6));
	}
}
