package com.simplilearn.exception;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		try {
			//throw key word is used to throw the exception
			if(age<18) {
				throw new MyException("Not Valid");
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
