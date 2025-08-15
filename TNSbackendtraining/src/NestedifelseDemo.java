//program to check number is positive,negative,zero and even or odd
import java .util.Scanner;
public class NestedifelseDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		if(num>0) {
			System.out.println("given number is positive");
			if(num%2==0) {
				System.out.println("given number is even");
			}
		else {
			System.out.println("given number is odd");
		}
	}
		else if(num<0) {
			System.out.println("given number is negative");
		}
		else{
			System.out.println("the number is zero");
		}
	}

}
