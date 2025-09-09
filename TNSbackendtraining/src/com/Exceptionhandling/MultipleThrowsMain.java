package com.tns.Exceptionhandling;

import java.io.IOException;

public class MultipleThrowsMain {

	public static void main(String[] args) {
		try {
		MultipleThrows.processfiles();

	}
		catch(IOException|NullPointerException e) {//after java 7 catch block can write single time
			System.err.println("File handling error");
			System.err.println("Null Value error");
		}

}
}