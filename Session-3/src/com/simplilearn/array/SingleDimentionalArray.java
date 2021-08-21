package com.simplilearn.array;

import java.util.Scanner;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		//single dimentional Array
		
		int a[]= {10,20,30,40,50,60};
		
		System.out.println("Length of an array: "+a.length);
		System.out.println("elemnt on index 3: "+a[3]);
		//printing all elements using an array
		System.out.println("usinf for loop");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("using for each loop");
		for(int element:a)
			System.out.println(element);
		//creating array object using new
		String b[]=new String[5];
		Scanner sc=new Scanner(System.in);
		//scanning element in array
		for(int i=0;i<b.length;i++) {
			System.out.println("Enter name");
			b[i]=sc.next();
		}
		System.out.println("printing string array");
		for(String element:b)
			System.out.println(element.toUpperCase());
	}
}
