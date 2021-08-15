package com.simplilearn.collection;

import java.util.Vector;

public class Venctor {

	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		
		vector.add(10);
		vector.add(30);
		vector.add(78);
		
		System.out.println(vector);
		vector.remove(2);
		System.out.println("after removing index 2 "+vector);
		vector.add(1, 80);
		System.out.println("after add on 0th index "+vector);
		
		System.out.println(vector.size());
	}
}
