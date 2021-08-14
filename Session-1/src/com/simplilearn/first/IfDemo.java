package com.simplilearn.first;

import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your age");
		int age=scanner.nextInt();
		
		if(age>=18)
			System.out.println("user is valid for Vote");
		else
			System.out.println("User is not valid for vote");
	}
}
