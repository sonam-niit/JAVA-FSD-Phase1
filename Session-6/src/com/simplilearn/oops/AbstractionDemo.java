package com.simplilearn.oops;

public class AbstractionDemo {

	public static void main(String[] args) {
		Shape s1=new Circle("red",2.5);
		Shape s2=new Rectangle("blue",5,8);
		System.out.println(s1);
		System.out.println(s2);
	}
}
abstract class Shape{
	private String color;
	public abstract String toString();

	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
class Circle extends Shape{

	double radius;
	public Circle(String color,double radius) {
		super(color);
		this.radius=radius;
	}

	public double area() {
		return Math.PI*(radius*radius);
	}
	@Override
	public String toString() {
		return "Circle color is "+getColor()+"a and area is "+area();
	}
	
}

class Rectangle extends Shape{

	double height,width;
	public Rectangle(String color,double height,double width) {
		super(color);
		this.height=height;
		this.width=width;
	}

	public double area() {
		return height*width;
	}
	@Override
	public String toString() {
		return "Rectangle color is "+getColor()+"a and area is "+area();
	}
	
}




