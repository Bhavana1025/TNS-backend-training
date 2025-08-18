package com.tns.oopsDemo;

public class OverridingAnimal {
  public void sound() {
	  System.out.println("animal makes sound");
  }
}
//sub class dog overrides animal
class Dog extends OverridingAnimal{
	public void sound() {
	System.out.println("dog barks");
}
}
    class Cat extends OverridingAnimal{
	public void sound(){
	System.out.println("cat sounds meow");
	}
}