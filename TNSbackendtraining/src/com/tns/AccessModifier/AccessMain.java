package com.tns.AccessModifier;

public class AccessMain {

	public static void main(String[] args) {
		AccessModifier obj = new AccessModifier();
		//private is not accessed out side the another class
		//public can access inside same class ,same package,different package etc..
		//you can't give publicobj.publicMethod here because you didn't declared public in main file 
		//protected is accessed in same class,same package,in child class,different package but not accessed in non-sub class
		//if it accessed by non sub class also then it may have same package name
		obj.protectedMethod();
		obj.publicMethod();
		obj.testall();
		
	}

}
