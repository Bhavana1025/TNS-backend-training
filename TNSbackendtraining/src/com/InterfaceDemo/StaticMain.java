package com.tns.InterfaceDemo;

public class StaticMain {

	public static void main(String[] args) {
		int result = SquareStatic.square(5);//call static method directly using interface name
         System.out.println("square of 5 is:"+result);
	}

}
