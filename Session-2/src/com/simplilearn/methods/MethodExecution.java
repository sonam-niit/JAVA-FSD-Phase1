package com.simplilearn.methods;

import java.util.Scanner;

public class MethodExecution {

	public int multiply(int a,int b)
	{
		return a*b;
	}
	
	public static void main(String[] args) {
		MethodExecution m=new MethodExecution();
		System.out.println("Multiplication "+m.multiply(3, 6));
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=sc.nextInt();
		System.out.println("enter first number");
		int num2=sc.nextInt();
		
		System.out.println("Multiplication "+m.multiply(num1, num2));
	}
}
