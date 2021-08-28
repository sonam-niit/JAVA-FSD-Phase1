package com.simplilearn.exception;

import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		//throw key word is used to throw the exception
		try {
		if(age<18) {
			throw new InterruptedException("Not Valid");
		}
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
