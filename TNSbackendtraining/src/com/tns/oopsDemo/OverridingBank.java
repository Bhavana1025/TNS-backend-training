package com.tns.oopsDemo;

public class OverridingBank {
public void getRateOfInterest(){
	System.out.println("the total interest of every bank");
}
}
class SBI extends OverridingBank{
	public void getRateOfInterest(){
		System.out.println("SBI interest is 7%");
		
	}
}
class ICICI extends OverridingBank{
	public void getRateOfInterest(){
		System.out.println("ICICI interest is 10%");
	}
}