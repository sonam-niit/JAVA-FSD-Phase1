package com.simplilearn.collection;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Double> list=new LinkedList<>();
		list.add(10.00);
		list.add(30.00);
		list.add(40.00);
		list.add(10.00);
		list.add(80.00);
		list.add(40.00);
		
		System.out.println(list);
		
		//enhanced for loop
		for(double x:list)
			System.out.println(x);
	}
}
