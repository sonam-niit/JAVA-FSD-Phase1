package com.simplilearn.rotatearray;

public class Main
{
	public static void main(String[] args) {
		RotateArray r = new RotateArray();
        		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        		r.rotate(arr, 2); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}
