package com.tns.AccessModifier;

public class AccessModifier {
	 	private int privatevar = 10;
	 	//instead of void display we use  void protectedMethod becz to showcase its behaviuor 
	 	//here we can use private void display also but if we use same void display for public and protected it will show error so we used privatemethod
	 	//here if we write only void display then it is said to public but private should use only in class file
	private void privateMethod() {
			System.out.println(privatevar);
				}
		 protected int protectedvar =30;	
		 protected void  protectedMethod() {
			 System.out.println(protectedvar);
		 }
		 public int publicvar = 40;
		 public void publicMethod() {
			 System.out.println(publicvar);
		 } 
	public void testall() {
		 privateMethod();
          protectedMethod();
            publicMethod();
            
}
}