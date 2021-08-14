package com.simplilearn.demos;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		//implicit Conversion
		System.out.println("Implicite Type Casting");
		char a='a';
		System.out.println("value of a "+a);
		int b=a;
		System.out.println("value of b "+b);
		float c=b;
		System.out.println("value of c "+c);
		long d=b;
		System.out.println("value of d "+d);
		double e=c;
		System.out.println("value of e "+e);
		
		
		//Explicite Coversion
		System.out.println("Explicite Type Casting");
		char x='a';
		System.out.println("value of a "+(char)(x-32));
		short s=(short)d;
		System.out.println("value of s "+s);
		float f=(float)e;
		System.out.println("value of f "+f);
		
		//user input conversion
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your money to withdraw");
		double amount=scanner.nextDouble();
		int receivedAmount=(int)amount;
		System.out.println("received Amount: "+receivedAmount);
		
	}
}
