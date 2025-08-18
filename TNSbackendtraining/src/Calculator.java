//using switch case
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number a:");
		int a = sc.nextInt();
		System.out.println("enter the number b:");
		int b = sc.nextInt();
		System.out.println("enter the operator(+,-,/,*):");
		char operator = sc.next().charAt(0);
		switch(operator) {
		//using normal switch case
		case '+' :
		System.out.println(a+b);
		break;
		case '-' :
			System.out.println(a-b);
			break;
		case '*' :
			System.out.println(a*b);
		case '/' :
			System.out.println(a/b);
			default :
				System.out.println("invalid operator");
		}

	}

}
