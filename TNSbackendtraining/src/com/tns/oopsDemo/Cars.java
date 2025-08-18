//interface is used in abstraction and multiple inheritance 
package com.tns.oopsDemo;

 interface Cars {
	void start();//abstract by default
	void stop();//abstract by default
}
class BMW implements Cars{//rollesroyce implements car interface
	//we use implements here bcz class to interface and we use extends if class to class inheritance
	public void start(){
		System.out.println("rollesroyce start with push button");
	}
		public void stop() {
			System.out.println("rollesroyce stop automatically");
		}
	}
class Audi implements Cars{
	public void start() {
		System.out.println("kia starts with ignition");
	}
	public void stop() {
		System.out.println("kia stops automatically");
	}
}
