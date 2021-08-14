package com.simplilearn.first;

public class First50EvenNumbers {

	public static void main(String[] args) {
		int i=0;
		do
		{
			System.out.println(i);
			if(i==50)//comparison Operator
				break;
			i+=2;//short hand operator
		}
		while(i<=100);
	}
}

//same using For Loop
//for(int i=0;i<=100;i=i+2)
//{
//	System.out.println(i);
//}

//same using while Loop
//while(i<=100)
//{
//	System.out.println(i);
//	i+=2;
//}