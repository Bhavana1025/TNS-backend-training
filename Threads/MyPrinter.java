package com.tns.Threads;

public class MyPrinter implements Runnable {
private  String threadMessage;
public MyPrinter(String message) {
	this. threadMessage=message;
}
@Override
public synchronized void run() {
	for(int i=0;i<=3;i++) {
		System.out.println(Thread.currentThread()+"thread:"+threadMessage);
	}
	
}
}
