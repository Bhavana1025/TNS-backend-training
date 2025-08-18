//print sum of 1 to n numbers using dowhileloop
import java.util.Scanner;
public class WhileSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num =sc.nextInt();
		int sum =0;
		int i=1;
	     do {
	    	 sum = sum+i;
	    	 System.out.println(sum);
	    	 i++;
	     }while(i<=num);
	}

}
