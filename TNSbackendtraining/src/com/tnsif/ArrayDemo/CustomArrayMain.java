package com.tnsif.ArrayDemo;

public class CustomArrayMain {

	public static void main(String[] args) {
		CustomArray[] obj =new CustomArray[2];
		obj[0] = new CustomArray(101 ," bhavana ", " CSE ");
		obj[1] =new CustomArray(102 , " manish ", " CSD ");
		for(CustomArray s: obj) {
		System.out.println(s);
		}
		 
	}

}
