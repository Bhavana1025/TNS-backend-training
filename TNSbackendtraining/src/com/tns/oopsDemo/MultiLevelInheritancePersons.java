//In multilevel inheritance child class has both parent and grand parent
//child class has the features of both parent and grandparent
package com.tns.oopsDemo;

public class MultiLevelInheritancePersons {
public void name() {
	System.out.println("name is bhavana");
}
public void age() {
	System.out.println("age is 21");
}
}
class employee extends MultiLevelInheritancePersons{
	public void salary() {
		System.out.println("salary is 30000");
	}
}
class Manager extends employee{
	public void bonus() {
		System.out.println("bonus is 3000");
	}
}