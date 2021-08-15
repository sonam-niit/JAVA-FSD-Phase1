package com.simplilearn.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashsetDemo {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		set.add(12);
		set.add(2);
		set.add(52);
		set.add(72);
		set.add(12);
		
		System.out.println("Hash Set "+set);
		
		LinkedHashSet<Integer> set1=new LinkedHashSet<>();
		set1.add(12);
		set1.add(2);
		set1.add(52);
		set1.add(72);
		set1.add(12);
		
		System.out.println("Linked Hash Set "+set1);
		
		TreeSet<Integer> set2=new TreeSet<>();
		set2.add(12);
		set2.add(2);
		set2.add(52);
		set2.add(72);
		set2.add(12);
		
		System.out.println("Tree Set "+set2);
		
	}
}
