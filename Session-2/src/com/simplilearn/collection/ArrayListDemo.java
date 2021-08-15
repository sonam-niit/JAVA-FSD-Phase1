package com.simplilearn.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(10);
		list.add(80);
		list.add(40);
		
		System.out.println(list);
		
		//enhanced for loop
		for(int x:list)
			System.out.println(x);
	}
}
