//Encapsulation
package com.tns.oopsDemo;

public class BankAccount {
       private int accountnumber;
       private double balance;
       public void setaccountnumber(int accountnumber) {
    	   this.accountnumber = accountnumber;
       }
       public int getaccountnumber() {
    	   return accountnumber;
       }
       public void setbalance(double balance) {
    	   this.balance=balance;
       }
       public double getbalance() {
    	   return balance;
       }
       public void displayDetails() {
       System.out.println("enter account details");
       }
}
