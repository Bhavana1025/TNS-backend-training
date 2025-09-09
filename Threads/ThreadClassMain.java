package com.tns.Threads;

public class ThreadClassMain {

	public static void main(String[] args) {
		ThreadClass t1 = new ThreadClass();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Thread exception:"+e);
		}
           t1.start();
	}

}
