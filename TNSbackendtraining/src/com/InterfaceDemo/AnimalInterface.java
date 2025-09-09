package com.tns.InterfaceDemo;
interface animal{
	void eat();
}
interface bird{
	void fly();
}

public class AnimalInterface implements animal,bird{

	@Override
	public void eat() {
		System.out.println("animal eats food");
		
	}

	@Override
	public void fly() {
		System.out.println("bird flies");
		
	}

}
