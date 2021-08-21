package com.simplilearn.string;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//equals
		String user="admin",password="admin123";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username");
		String userInput=sc.next();
		System.out.println("Enter Password");
		String passwordInput=sc.next();
		
		if(user.equals(userInput) && password.equals(passwordInput))
		{
			System.out.println("Logged In Successfully");
		}
		else {
			System.out.println("Wrong Username and password");
		}
	}

}
