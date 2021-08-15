package com.simplilearn.constructor;

public class Student {

	int rollNo;
	String name;
	String address;
	static String college="St. John College"; //use of static variable
	//default constructor
	public Student()
	{
		System.out.println("Default constructor");
	}
	//parameterized constructor
	public Student(int rollNo,String name,String address)
	{
		//use of this keyword
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
	}
	
	public void display() {
		System.out.println("Roll No: "+rollNo );
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("College: "+college);
	}
}
