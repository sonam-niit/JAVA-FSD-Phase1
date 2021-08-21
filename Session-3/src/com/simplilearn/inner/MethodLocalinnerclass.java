package com.simplilearn.inner;

//creating a class inside a method
public class MethodLocalinnerclass {

	private String msg="Method Local Inner class";
	 
	void display()
	{
		class Inner{
			void msg() {
				System.out.println(msg);
			}
		}
		
		//object can create inside the method
		Inner i=new Inner();
		i.msg();
	}
	
	public static void main(String[] args) {
		MethodLocalinnerclass m=new MethodLocalinnerclass();
		m.display();
		
	}
}
