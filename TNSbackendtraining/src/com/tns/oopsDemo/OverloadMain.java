package com.tns.oopsDemo;

public class OverloadMain {

	public static void main(String[] args) {
		OverloadDemo obj = new OverloadDemo();
		System.out.println("enter a number:"+ obj.add(1, 2));
		System.out.println("enter a number:"+ obj.add(1.5f, 2.2f,3.3f));
		System.out.println("enter a number:"+ obj.add(5.66d, 2.45d,6.78d,8.34f));

	}

}
