package com.tnsif.ArrayDemo;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[]= {34,56,78,32,21};
		//initial first =-infinite,second=-infinite
		int first =Integer.MIN_VALUE,second=Integer.MAX_VALUE;
		for(int num : arr) {
			//34>-infinite(true)
		if(num>first) {
			//second=-infinite//from initial first==infinite
			second = first;
			//first=34
			first =num;
		}
		else if(num > second && num!=first){
			second = num;
		}
		}
		System.out.println(second);
    }

}
