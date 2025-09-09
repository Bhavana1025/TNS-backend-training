package com.tns.Exceptionhandling;

public class Throw {

	public static void main(String[] args) {
    	int num =-5;
		if(num<0) {
			throw new ArithmeticException("number cant be negative");
		}
		System.out.println("number is:"+num);

	}

}
