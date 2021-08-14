package com.simplilearn.first;

public class Car {

	//properties: member variables
	private int modelNumber;
	private String brandName;
	private String color;
	
	//methods : member function
	public void start()
	{
		System.out.println("Car started");
	}
	public void stop()
	{
		System.out.println("Car stopped");
	}
	
	public static void main(String[] args) {
		Car  c=new Car();//object
		
		c.start();
		c.stop();
	}
}
