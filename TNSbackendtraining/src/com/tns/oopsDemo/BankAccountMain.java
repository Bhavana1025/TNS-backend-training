package com.tns.oopsDemo;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		 obj.displayDetails();
		obj.setaccountnumber(123567);
		System.out.println("account number:"+obj.getaccountnumber());
		obj.setbalance(1000.0);
		System.out.println("current balance:"+obj.getbalance());
		//if we want to use scanner use in main class not in class file
       
	}

}
