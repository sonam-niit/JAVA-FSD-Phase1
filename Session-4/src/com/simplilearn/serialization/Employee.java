package com.simplilearn.serialization;

import java.io.Serializable;

public class Employee implements Serializable{

	private int empCode;
	private String empName;
	transient private String empPhone;
	private String empAddress;
	
	public static void main(String[] args) {
		
		//Thread.sleep(1000);//checked exception
		
		System.out.println("divide by zero "+(34/0));// unchecked throw at run time
	}
}
