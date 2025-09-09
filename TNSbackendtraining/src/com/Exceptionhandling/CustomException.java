package com.tns.Exceptionhandling;

public class CustomException {
	static void validateAge(int age) throws  InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("the age must be above 18 to vote");
		}
		else {
			System.out.println("you can vote");
		}
	}

}
