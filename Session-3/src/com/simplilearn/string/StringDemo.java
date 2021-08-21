package com.simplilearn.string;

import java.util.Scanner;

public class StringDemo {

public static void main(String[] args) {
	String s1=new String("Hello");
	
	System.out.println("Length of a string "+s1.length());
	
	String s2="Hello";
	
	//comparing object
	System.out.println(s1==s2);
	
	System.out.println("compare String: "+s1.compareTo(s2));
	
	//subString
	String sub=new String ("Welcome");
	System.out.println(sub.substring(3));
	System.out.println(sub.substring(2,6));
	
	String s3="";
	System.out.println("Check Empty or not: "+s3.isEmpty());
	//to uppercase & lowercase
	
	System.out.println("to Upper Case:"+s1.toUpperCase());
	System.out.println("to lower case: "+s1.toLowerCase());
	//trim
	String s4="         Sonam Soni         ";
	System.out.println("String length without trim: "+s4.length());
	String s5=s4.trim();
	System.out.println("String after trim: "+s5.length());
	//replace
	String s6="Welcome to simplilearn";
	String replace=s6.replace("simplilearn", "java");
	System.out.println("Before Replace: "+s6);
	System.out.println("After Replace: "+replace);
	
	
	
	
	
	
	
	
	
}
}
