package com.saimplilearn.inheritance;

public class Child extends Parent{

//	public Child(){
//		//super();
//		System.out.println("Child class Constructir");
//	}
	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.str);
		c.print();
	}
}
