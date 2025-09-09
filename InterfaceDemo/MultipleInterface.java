package com.tns.InterfaceDemo;
//first interface
interface A{
	void methodA();
}
interface B{
	void methodB();
}
public class MultipleInterface implements A,B {

	@Override
	public void methodB() {
		System.out.println("my method A");
		
	}

	@Override
	public void methodA() {
		System.out.println("my method B");
		
	}

}
