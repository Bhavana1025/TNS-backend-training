package com.tns.Threads;

public class MyPrinterMain {

	public static void main(String[] args) {
		MyPrinter sharedRunnable = new MyPrinter("shared message");
		Thread t1 = new Thread(sharedRunnable,"Message for thread t1");
		Thread t2 = new Thread(sharedRunnable,"Message for thread t2");
     t1.start();
     t2.start();
	}

}
