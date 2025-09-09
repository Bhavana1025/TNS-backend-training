package com.tns.Exceptionhandling;

public class Array {

	public static void main(String[] args) {
		try {
		int arr[] = {1,2,3,4};
		System.out.println(arr[4]);
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("the given number is out of index. enter the number lesser or equal to index");
		}

}
}