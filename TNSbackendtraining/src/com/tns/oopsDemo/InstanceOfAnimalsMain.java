package com.tns.oopsDemo;

public class InstanceOfAnimalsMain {

	public static void main(String[] args) {
		InstanceOfAnimals a = new InstanceOfAnimals();
		dog d = new dog();
		cat c =new cat();
		System.out.println("a instacnceof Animal:"+(a instanceof InstanceOfAnimals));//true
		System.out.println("d instacnceof Animal:"+(d instanceof InstanceOfAnimals));//dog belong to animal class so it is true
		System.out.println("d instacnceof dog:"+(d instanceof dog));//dog belongs to dong class and animal class so it is true
		//System.out.println("c instacnceof dog:"+(c instanceof dog));//cat belongs to animals class not parent so it is false
		System.out.println("a instacnceof object:"+(a instanceof Object));//object is a universal superclass(parent)in java 
		System.out.println("d instacnceof object:"+(d instanceof Object));
	}

}
