package com.simplilearn.constructor;

public class Constructordemo {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.rollNo=34;
		s1.name="sonam";
		s1.address="Mumbai";
		Student s2=new Student();
		s2.name="Pooja";
		s2.rollNo=56;
		s2.address="Ahmedabad";
		s1.display();
		s2.display();
		
		Student s3=new Student(78, "Alex", "NewYork");
		s3.display();
	}
}
