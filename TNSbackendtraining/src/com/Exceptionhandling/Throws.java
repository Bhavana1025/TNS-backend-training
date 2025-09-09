package com.tns.Exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Throws {
	//method declares that may throw IOException
    static void readFile() throws IOException{
    	FileReader fr =new FileReader("test.txt");//attempts to open the file test 
    	BufferedReader br =new BufferedReader(fr);//wraps the filereader in bufferreader to read text  and to use readline
    	System.out.println(br.readLine());//reads line by line
    	br.close();
    }
}
