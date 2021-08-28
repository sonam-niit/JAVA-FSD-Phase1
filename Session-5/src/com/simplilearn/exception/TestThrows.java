package com.simplilearn.exception;

public class TestThrows {

	public void testAge(int age) throws MyException{
		if(age<18) {
			throw new MyException("User is not valid for vote");
		}
		else {
			System.out.println("valid");
		}
	}
	
	public void checkUser(int value) throws MyException{
		testAge(value);
	}
	
	public static void main(String[] args) {
		TestThrows t=new TestThrows();
		//t.checkUser(12);
		try {
		t.checkUser(12);
		}
		catch(MyException e) {
			System.out.println(e);
		}
	}
}
