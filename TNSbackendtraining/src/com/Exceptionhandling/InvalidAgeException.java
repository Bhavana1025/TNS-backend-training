package com.tns.Exceptionhandling;
//for custom exception
 class  InvalidAgeException extends Exception{

	public InvalidAgeException(String message) {//in constructor we wrote string message to store the throwable message
//if we dont write get message also it is valid but in main file if you write.getmessage then the output will be null so we write (string message)		
		super(message);
	}

}
