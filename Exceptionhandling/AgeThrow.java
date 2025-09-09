package com.tns.Exceptionhandling;

public class AgeThrow {
	public static void age(int age){
		if(age<18) {
			throw new IllegalArgumentException("age must be 18 or above");//throw an exception object inside the method/block
		}
		System.out.println("age is:"+age);
	}

}
