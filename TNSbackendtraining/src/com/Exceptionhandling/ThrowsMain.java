package com.tns.Exceptionhandling;

import java.io.IOException;

public class ThrowsMain {

	public static void main(String[] args) {
		try {
			Throws.readFile();
		}
		catch(IOException e){
			System.err.println("file not found or error reading file");
		}
	}

}
