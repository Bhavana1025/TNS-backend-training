package com.tnsif.ArrayDemo;

public class MaxMin {

	public static void main(String[] args) {
		int arr[] = {45,56,67,89,9};
		int max=arr[0],min =arr[0];
		//start with 0th element arr[0] for 2>3 3is larger so update max wth 3 and so on..
		//start with 0th element arr[0] for 2<3 2is larger so no updation required so on..
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
		
		}
		System.out.println(max);
		System.out.println(min);
	}
	
}
