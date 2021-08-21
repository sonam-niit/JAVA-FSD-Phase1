package com.simplilearn.string;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s=new StringBuffer("Welcome");
		System.out.println(s);
		s.append(" to simplilearn");
		System.out.println(s);
		s.append(" and enjoy learning JAVA");
		System.out.println(s);
		
		//insert
		s.insert(0, "w");
		System.out.println(s);
		//repplace
		s.replace(0, 2, "W");
		System.out.println(s);
		
		//delete
		s.delete(0, 1);
		System.out.println(s);
		System.out.println("String Builder Demo");
		StringBuilder s1=new StringBuilder("Happy");
		
		s1.append(" Learning");
		System.out.println(s1);
		System.out.println(s1.replace(0, 2, "hA"));
		
		System.out.println(s1.delete(0, 6));
		//conversion from StringBuilder and StringBuffer to String
		String new1=s.toString();
		String new2=s1.toString();
		
		//conversion from string to String Buffer
		String x="New String";
		StringBuffer s2=new StringBuffer(x);
		System.out.println(s2.reverse());
		
		//conversion from String to StringBuilder
		String y="myString";
		StringBuilder s4=new StringBuilder(y);
		System.out.println(s4.append(" Hello"));
	}

}
