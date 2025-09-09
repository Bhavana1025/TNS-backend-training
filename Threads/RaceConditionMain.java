package com.tns.Threads;

public class RaceConditionMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new RaceCondition());
		Thread t2 = new Thread(new RaceCondition());
           t1.start();
           t2.start();
	}

}
