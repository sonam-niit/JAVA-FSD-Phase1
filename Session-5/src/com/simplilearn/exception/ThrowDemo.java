package com.simplilearn.exception;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		//throw key word is used to throw the exception
		if(age<18) {
			throw new ArithmeticException("Not Valid");
		}
	}
}
