package com.saimplilearn.inheritance;

public class Parent {

	private String msg="Hello everyone";
	public String str="My Parent Property";
	
	public Parent(){
		System.out.println("Parent Constructor");
	}
	protected void print() {
		System.out.println("Parent Print Method");
	}
}
