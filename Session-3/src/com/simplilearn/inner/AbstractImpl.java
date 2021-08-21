package com.simplilearn.inner;

public class AbstractImpl {

	
	public static void main(String[] args) {
	
		AnonymousInnerClass a=new AnonymousInnerClass() {
			
			//Method implementation
			@Override
			void display() {
				System.out.println("implemenattioon of Abstract Class");
				
			}
		};
		
		a.display();
	}
}
//* implementation of Abstract class in a simple way
//public class AbstractImpl extends AnonymousInnerClass {
//
//	void display()
//	{
//		System.out.println("this is method from Abstract class");
//	}
//	
//	public static void main(String[] args) {
//	
//		new AbstractImpl().display();
//	}
//}

