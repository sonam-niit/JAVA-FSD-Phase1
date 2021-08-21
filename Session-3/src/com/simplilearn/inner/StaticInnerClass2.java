package com.simplilearn.inner;

public class StaticInnerClass2 {

	private static String msg="Welcome to the world of Inner Class";
	
	
	static class Inner{
		void hello()
		{
			System.out.println(msg);
		}
	}
	
	public static void main(String[] args) {
		
		//StaticInnerClass2 obj=new StaticInnerClass2();//object of Outer class
		StaticInnerClass2.Inner inner= new StaticInnerClass2.Inner();
		
		inner.hello();
	}
}
