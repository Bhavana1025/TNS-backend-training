//using superkeyword with variables(super.variablename),method(super.method name()) and constructor(super())
package com.tns.oopsDemo;
//parent class
public class SuperkeywordPerson {
String name;
int age;
//default constructor
SuperkeywordPerson(){
	 name = "bhavana";
	 age = 21;
}
}
//child class
class Studentu extends SuperkeywordPerson{
	int studentId;
	int studentrollno;
//default constructor
Studentu(){
	super();//to define child class frstly  we should call parent class.
	studentId = 12345;
	studentrollno =2342345;	
}
}