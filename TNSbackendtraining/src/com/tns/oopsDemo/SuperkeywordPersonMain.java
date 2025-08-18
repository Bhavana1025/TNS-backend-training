package com.tns.oopsDemo;

public class SuperkeywordPersonMain {

	public static void main(String[] args) {
		SuperkeywordPerson obj = new SuperkeywordPerson();
		System.out.println("name:"+obj.name);//for variables we should use obj.name not obj.name()(it is calling method)
		System.out.println("age:"+obj.age);
		Studentu ob = new Studentu();
		System.out.println("id:"+ob.studentId);
		System.out.println("rollno:"+ob.studentrollno);
	}

}
