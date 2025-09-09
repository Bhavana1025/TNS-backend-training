package com.tns.InterfaceDemo;
//Demo for default interface
public interface Printer {
	default void printmessage() {
		System.out.println("hello from printer");
	}
	void papers();
	void colorsimages();

}
