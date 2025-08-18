//in single level inheritance there is single parent and single child
package com.tns.oopsDemo;

public class SingleInheritanceAnimal {
public void eat() {
	System.out.println("Animal eat food");
}
}
class elephant extends SingleInheritanceAnimal{
	public void sound() {
		System.out.println("elephant gives sound");
	}
}
