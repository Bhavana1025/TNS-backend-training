package com.tnsif.ArrayDemo;

public class Duplicate {

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,5,6,7,8,8,6,4};
		//int i =0 means arr[0]element=2
		for(int i=0;i<arr.length;i++) {
			//int i+1=0+1 means arr[1]elemnt=3 
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

}
