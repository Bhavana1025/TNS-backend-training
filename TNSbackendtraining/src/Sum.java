//sum of first 10 numbers using for loop
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	 int sum = 0;
	 for(int i = 0; i<=10;i++) {
		 sum = sum+i;
		 System.out.println(sum);
	 }
   }
}
