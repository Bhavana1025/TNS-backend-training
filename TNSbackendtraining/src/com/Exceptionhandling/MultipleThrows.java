package com.tns.Exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class MultipleThrows {
	static void processfiles() throws IOException,NullPointerException{
		FileReader fr = new FileReader("data.txt");
		String str = null;
		System.err.println(str.length());//NullPointerException
	}

}
