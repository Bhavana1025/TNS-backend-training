package com.tns.oopsDemo;

public class CarsMain {

	public static void main(String[] args) {
		Cars myCar;
		myCar = new BMW();
		myCar.start();
		myCar.stop();
		System.out.println();
		myCar = new Audi();
		myCar.start();
		myCar.stop();
		
	}

}