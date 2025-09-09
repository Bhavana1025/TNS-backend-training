package com.tns.InterfaceDemo;

public class PaymentMain {

	public static void main(String[] args) {
		CreditCardPayment obj = new CreditCardPayment();
		UpiPayment obj1 = new UpiPayment();
		obj.payment(5000);
		System.out.println("paid by credit card");
		obj1.payment(6000);
		System.out.println("paid by upi");
		

	}

}
