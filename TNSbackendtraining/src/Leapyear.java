//program on Leapyear
import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		if((num%100!=0 && num%4==0)||num%400==0){
			System.out.println("the given year is leap year");
		}
		else {
			System.out.println("not a leap year");
		}
         
	}

}
