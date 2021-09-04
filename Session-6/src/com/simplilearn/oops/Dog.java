package com.simplilearn.oops;

public class Dog {
//encaptulation
	private String name;
	private String breed;
	private int age;
	private String color;
	public Dog(String name, String breed, int age, String color) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Hi my name is " + getName() + ".\nMy breed is " + getBreed() + ".\n My age is " + 
	getAge() + ".\nMy color is " + getColor() + ".";
	}
	
	public static void main(String[] args) {
		Dog scott=new Dog("Scott", "pappilon", 5, "black");
		
		System.out.println(scott);
	}
}
