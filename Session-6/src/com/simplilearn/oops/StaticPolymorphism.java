package com.simplilearn.oops;

//same name with different parameters
//Method Overloading/ compile time Polymorphism / static Polymorphism / early binding
public class StaticPolymorphism {

	public void add(int b,int h)
	{
		System.out.println("Addition of 2 int "+(b*h));
	}
	public void add(int a,int b,int c) {
		System.out.println("Addition 3 int "+(a+b+c));
	}
	public void add(float a,float b) {
		System.out.println("addition of 2 floats "+(a+b));
	}
	
	public static void main(String[] args) {
		StaticPolymorphism obj=new StaticPolymorphism();
		obj.add(56.7f, 90.0f);
		obj.add(12, 56);
		obj.add(4, 5, 7);
		
	}
}
