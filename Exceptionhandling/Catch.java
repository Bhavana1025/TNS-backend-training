package com.tns.Exceptionhandling;

public class Catch {

	public static void main(String[] args) {
		try {
			int n =10/0;
			int arr[] = {1,2,3,4};
			System.out.println("the result"+n);
			System.out.println(arr[4]);
		}
		catch(ArithmeticException e) {
			System.err.println("dividing with zero is not allowed. give a positive number");
		}
			catch(ArrayIndexOutOfBoundsException e) {
				System.err.println("the given number is out of index. enter the number lesser or equal to index");
			}
              catch(Exception e) {
            	  System.out.println("general exception caught");
	}

		 System.out.println("program continues after multiple catch blocks");
	}
	//after version 7 instead of writing multiple catch blocks
	//catch(ArthmeticException|ArrayIndexOutOfBoundsException e)
	//{ System.out.println("Exception caught:"+ e);

}
