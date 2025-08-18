//using for loop
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		long factorial = 1;
		//i<=n->(i=1,2,3,4,5)(n=5)bcz factorial of 5 is(1x2x3x4x5)
		for(int i = 1; i<=n ;i++) {
			factorial = factorial*i;
		}
		//if we write print function outside the forloop then we will get only value of 5->120
		//if we use print function inside the forloop we will get total value of 5->1,2,6,24,120
		System.out.println("the factorial of "+ n +" is " +factorial);
		//if the number is 
	}

}
