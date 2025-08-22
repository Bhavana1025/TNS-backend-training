package com.tnsif.ArrayDemo;

public class CustomArray {
	int sid;
	String name;
	String branch;
	public CustomArray(int sid,String name,String branch) {
		this.sid=sid;
		this. name=name;
		this. branch=branch;
	}
	public String toString() {
		return("sid: " + sid + " name:" + name + "branch:" + branch);
		}

}
