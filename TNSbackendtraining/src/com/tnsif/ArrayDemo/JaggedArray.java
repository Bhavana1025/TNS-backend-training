package com.tnsif.ArrayDemo;

public class JaggedArray {

	public static void main(String[] args) {
		int arr[][] = {
				{2,3,4},
				{4,5},
				{1,2,3,4}
		};
		for(int i =0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
