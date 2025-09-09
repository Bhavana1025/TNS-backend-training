package com.tns.InterfaceDemo;
//multiple Inheritance using default methods
interface C{
	default void show() {//using default method
	System.out.println("show A");
}
}
interface D{
	default void show() {
		System.out.println("show B");//it implements conflict because default method has same method name
	}
}
public class Multiple implements C,D{//to resolve conflict use super keyword to call particular method

	@Override
	public void show() {
		System.out.println("using default parameters");
		C.super.show();//call A's Show 
		D.super.show();//call B's Show
	}

}
