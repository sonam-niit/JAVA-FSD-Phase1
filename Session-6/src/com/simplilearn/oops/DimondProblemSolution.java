package com.simplilearn.oops;

public class DimondProblemSolution implements First,Second {

	@Override
	public void show() {
		First.super.show();
		Second.super.show();
	}
	
	public static void main(String[] args) {
		DimondProblemSolution d=new DimondProblemSolution();
		d.show();
	}

}
interface First{
	
	default void show() {
		System.out.println("Default First");
	}
}
interface Second{
	default void show() {
		System.out.println("Default Second");
	}
}