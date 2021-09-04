package com.simplilearn.oops;

public class InhgeritanceDemo{
	public static void main(String[] args) {
		MountainBike m=new MountainBike(3, 100, 23);
		System.out.println(m);
	}
}
class Bicycle {

	int gear;
	int speed;
	public Bicycle(int gear, int speed) {
		//super();
		this.gear = gear;
		this.speed = speed;
	}
	void applyBreak(int decrement) {
		speed-=decrement;
	}
	void speedUp(int increment) {
		speed+=increment;
	}
	public String toString() {
		return "No of gears are "+gear+"\nSpeed of Bycycles is "+speed;
	}
}
class MountainBike extends Bicycle{

	int startHeight;
	public MountainBike(int gear, int speed,int startHeight) {
		super(gear, speed);
		this.startHeight=startHeight;
	}
	public int getStartHeight() {
		return startHeight;
	}
	public void setStartHeight(int startHeight) {
		this.startHeight = startHeight;
	}
	public String toString() {
		return super.toString()+"\nSeat hight "+startHeight;
	}
}
