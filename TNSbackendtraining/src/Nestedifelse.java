//largest number
import java.util.Scanner;
public class Nestedifelse {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number:");
		int a =sc.nextInt();
		System.out.println("enter a number:");
		int b =sc.nextInt();
		System.out.println("enter a number:");
		int c=sc.nextInt();
		if(a>b) {
			if(a>c) 
				System.out.println(a+ " is the largest number");
			
		else {
			System.out.println(c+ " is the largest number");
		}
	}
		else {
			if(b>c) 
				System.out.println(b+" is the largest number");	
			else {
			System.out.println(c+" is the largest number");
		}

	}

  }
}