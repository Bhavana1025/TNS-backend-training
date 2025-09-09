package com.tns.InterfaceDemo;//until java 7 version

public interface Calculator {//what to do (add,sub,divide,multiply)
void add(int a, int b);//abstract method
void subract(int a, int b);
void divide(int a, int b);
void multiply(int a, int b);
//default void remainder() {//after java 8 version introduced
//commoncode();//called from private method
//	System.out.println("...");//if you want to override the content in sys in another file so u should use default
//}
//static void etc() {
//	System.out.println("...");//it is static so to access it in main class we use interface name.etc
//}//if you dont want to override then u use static
}//we cant call default method in static but static can call in default also
//after version 9 introduced(we can use private also)
//private void commoncode() {//if we use only private is onlly accesed in default
//	System.out.println("bufygv");
//}
//private is used for code reusability(means if there are any duplication code in default methods)
//private static void commoncode() {//if we use static then we can use in both default and static
//	System.out.println("bufygv");
//}
