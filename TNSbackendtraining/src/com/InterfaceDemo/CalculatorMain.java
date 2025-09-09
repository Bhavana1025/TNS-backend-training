package com.tns.InterfaceDemo;
import java.util.Scanner;
public class CalculatorMain {

	public static void main(String[] args) {
		SimpleCalculator obj = new SimpleCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number:");
		int a = sc.nextInt();
		System.out.println("enter the second number:");
		int b = sc.nextInt();
		obj.add(a,b);
		obj.subract(a ,b);
		obj.divide(a ,b);
		obj.multiply(a ,b);
		sc.close();
	}

}
