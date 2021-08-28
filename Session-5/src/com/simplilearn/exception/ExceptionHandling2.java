package com.simplilearn.exception;

import java.util.Scanner;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		try {
			result=num1/num2;
			System.out.println("Result is "+result);
		}
		catch(Exception e) {
			System.out.println("Error Occured "+e);
			System.out.println("Try after sometime");
		}
		
		finally {
			sc.close();
			System.out.println("Connection closed");
		}
		
	}
}
