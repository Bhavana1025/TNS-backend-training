package com.tns.oopsDemo;

import java.util.Scanner;

public class TicketBookingMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//input 
		TicketBooking obj = new TicketBooking();
		System.out.println("stage event:");
		String stageevent =sc.nextLine();
		System.out.println("customer:");
		String customer = sc.nextLine();//input string for customer name
		System.out.println("seats:");
		int noofseats = sc.nextInt();
		System.out.println("price per seat:");
		double price = sc.nextInt();
		System.out.println("paymenttype(A.cash/B.walletnumber/C.creditcart):");
		char paymenttype =sc.next().charAt(0);
//		System.out.println("enter walletnumber:");
//		int walletnumber =sc.nextInt();
//		System.out.println("enter creditcardnumber:");
//		double cash =sc.nextDouble();
		obj.setValue(stageevent);
		obj.setValue(stageevent,customer);
		obj.setValue(stageevent,customer,noofseats);
		obj.setValue(stageevent,customer,noofseats,paymenttype);
		obj.setValue(stageevent,customer,noofseats,paymenttype,price);
		obj.getValue();
		obj.getValue(" ");//here in paranthesis i have given " " without " " also we write ,for clarity to know for which getvalue belongs i have written
		obj.getValue(0);
		obj.getValue(0.0);
		obj.getValue(' ');
//		obj.cash(paymenttype);
		obj.getValue(noofseats,price);
		System.out.println("enter walletnumber:");
		int walletnumber =sc.nextInt();
		System.out.println("enter creditcardnumber:");
		double cash =sc.nextDouble();
		System.out.println(obj);
	}

}
