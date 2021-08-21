package com.simplilearn.inner;

public class InnerClass1 {

	private String msg="Welcome to the world of Inner Class";
	
	private int getCube(int x) {
		return x*x*x;
	}
	class Inner{
		void hello()
		{
			System.out.println(msg);
			System.out.println("cube of 6 "+getCube(6));
		}
	}
	
	public static void main(String[] args) {
		
		InnerClass1 obj=new InnerClass1();//object of Outer class
		InnerClass1.Inner inner= obj.new Inner();
		
		inner.hello();
	}
}
