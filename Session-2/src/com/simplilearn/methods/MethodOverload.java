package com.simplilearn.methods;

//same name with different parameters
//Method Overloading/ compile time Polymorphism / static Polymorphism / early binding
public class MethodOverload {

	public void area(int b,int h)
	{
		System.out.println("Area of Triangle "+(b*h));
	}
	public void area(int r) {
		System.out.println("Area of circle "+(3.14*r*r));
	}
	public void area(float s) {
		System.out.println("Area of Square "+(s*s));
	}
	
	public static void main(String[] args) {
		MethodOverload obj=new MethodOverload();
		obj.area(23.6f);
		obj.area(34);
		obj.area(3, 7);
	}
}
