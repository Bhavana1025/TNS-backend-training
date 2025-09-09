package com.tns.Threads;

public class RaceCondition implements Runnable {
	private int counter = 0;//shared resource
	public void run() {
		for(int i=0;i<=5;i++) {
			counter++;// bcz you are incrementing the shared resource(count)
			System.out.println(Thread.currentThread().getName()+"Current Thread:"+counter);
		}

}
}
