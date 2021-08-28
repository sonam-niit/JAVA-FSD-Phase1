package com.simplilearn.doubt;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {

	public static void main(String[] args) {
		Employee e1=new Employee(2003,"Sonam Soni");
		Employee e2=new Employee(4009,"Nitish");
		Employee e3=new Employee(1001,"Albert");
		
		ArrayList<Employee> list=new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println("Before sort: "+list);
		//sorting elements
		
		Collections.sort(list);
		
		System.out.println("After Sort "+list);
	}
}
