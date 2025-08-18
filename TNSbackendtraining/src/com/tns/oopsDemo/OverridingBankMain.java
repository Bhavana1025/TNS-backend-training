package com.tns.oopsDemo;

public class OverridingBankMain {

	public static void main(String[] args) {
		OverridingBank obj =new OverridingBank();
		obj.getRateOfInterest();
		SBI ob =new SBI();
		ob.getRateOfInterest();
		ICICI objj = new ICICI();
		objj.getRateOfInterest();

	}

}
