package com.simplilearn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

public static void main(String[] args) {
		
		String pattern="^[abc]at";
		String check1="bat";
		String check2="cat";
		String check3="ayt";
		String check4="syt";
		
		Pattern p=Pattern.compile(pattern);
		Matcher m1=p.matcher(check1);
		
		System.out.println(m1.matches());
		
		Matcher m2=p.matcher(check2);
		
		System.out.println(m2.matches());
		
		Matcher m3=p.matcher(check3);
		
		System.out.println(m3.matches());
		Matcher m4=p.matcher(check4);
		
		System.out.println(m4.matches());
		
		
		
	}
}
