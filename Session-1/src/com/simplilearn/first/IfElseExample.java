package com.simplilearn.first;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your percentage");
		float per=scanner.nextFloat();
		
		if(per>=70 && per<=100) //logical operator
			System.out.println("congartulations..! you got Distinction");
		else if(per>=60 && per<70)
			System.out.println("congartulations..! you got First Class");
		else if(per>=50 && per<60)
			System.out.println("congartulations..! you got Second class");
		else if(per>=35 && per<50)
			System.out.println("congartulations..! you got Pass class");
		else if(per>=0 && per<35)
			System.out.println("Sorry You are fail");
		else
			System.out.println("Kindly enter correct Percentage");
	}
}
