package com.tns.InterfaceDemo;

public class MyPrinter implements Printer {

	@Override
	public void papers() {
		System.out.println("printer prints papers");
		
	}

	@Override
	public void colorsimages() {
		System.out.println("printer colors images");
		
	}
//	@Override
//	public void printmessage() {
//		System.out.println("hello from printer");
//	}
//	

}
