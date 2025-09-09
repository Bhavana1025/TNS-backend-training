package com.tns.Exceptionhandling;

public class Finally {

	public static void main(String[] args) {
		try {
			int n =10/0;
			System.out.println("the result"+n);
		}
		catch(ArithmeticException e) {
			System.err.println("dividing with zero is not allowed. give a positive number");
		}
        finally {
        	System.out.println("this is the finally block.it always executes.");
	}
           System.out.println("Program continues after try-catch-finally");

	}

}
