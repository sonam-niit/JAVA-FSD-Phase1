package com.simplilearn.exception;

import java.util.Scanner;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		
		int a[]=new int[3];
		int x=10;
		for(int i=0;i<7;i++) {
			a[i]=x;
			x=x+10;
		}
		
		for (int num:a)
		System.out.println(num);
		
	}
}
