package com.tns.Threads;

public class RunnableInterfaceMain {

	public static void main(String[] args) {
		Thread t1 = new Thread (new RunnableInterface());//this new runnableinterface creates a object
		//another method
		//RunnableInterface obj =new RunnableInterface();
		//Thread t1 = new Thread(obj)
		t1.start();
		

	}

}
