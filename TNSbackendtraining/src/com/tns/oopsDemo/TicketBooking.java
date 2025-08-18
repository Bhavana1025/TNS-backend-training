//Ticketbooking using overloading
package com.tns.oopsDemo;
import java.util.Scanner;//import always should be after the package

public class TicketBooking {
	private String stageevent;//using private keyword
	private String customer;
	private int noofseats;
	private char paymenttype;
	private double price;
	private int number;
	private double total;
	
	public void setValue(String stageevent){
		this.stageevent = stageevent;
	}
	public  String getValue() {
		return stageevent;
	}
	public void setValue(String stageevent,String customer) {//overload should have same method name but different no.of parameters
		this.stageevent = stageevent;
		this.customer = customer;
	}
	public  String getValue(String type) {
		return customer;
	}
	public void setValue(String stageevent,String customer,int noofseats) {
		this.stageevent = stageevent;//this is used to reffer the current variables present in the parameters
		this.customer = customer;
		this.noofseats = noofseats;
	}
	 public int getValue(int type) {
	    	return noofseats;
	    }
	public void setValue(String stageevent,String customer,int noofseats,char paymenttype) {
		this.stageevent = stageevent;
		this.customer = customer;
		this.noofseats = noofseats;
		this.paymenttype = paymenttype;
	}
	public char getValue(char type) {//i have took char becz same data type in one class is not allowed
		return paymenttype;
	}
    public void setValue(String stageevent,String customer,int noofseats, char paymenttype,double price) {
    	this.stageevent = stageevent;
		this.customer = customer;
		this.noofseats = noofseats;
		this.paymenttype = paymenttype;
    	this.price = price;
    }
    public double getValue(double type) {
    	return price;
    }
    public void getValue(int noofseats,double price) {
    	double total = noofseats * price;
    	System.out.println("the total price:" + total);//to get the total price
    }
//    public void cash(char paymenttype) {
//    	System.out.println("give cash");
//    }
//    public void walletnumber(char paymenttype) {
//    	System.out.println("walletnumber:"+number);
//    }
//    public void creditcard(char paymenttype) {
//    	System.out.println("credict card:"+number);
//    }
    public String toString() {//it is used to convert the hashcode into actual output
    	return ("stage event is:" + stageevent + ", customer name:" + customer + ", noof seats:" + noofseats + ", price per seat:" + price + ", paymenttype is:" + paymenttype + ", total price is:" + total);
    }
}
