package com.tns.oopsDemo;

public class StudentMain {

	public static void main(String[] args) {
		Student obj = new Student();
		obj.setsage(20);
		System.out.println("age:"+obj.getsage());
		obj.setsname("Bhavana");
		System.out.println("name :"+obj.getsname());
	}

}
