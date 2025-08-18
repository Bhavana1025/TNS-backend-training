//days in a week
import java.util.Scanner;
public class Switchcase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the day:");
         int day = sc.nextInt();
         switch(day) {
         //using enhanced switch case
         case 1 ->
         System.out.println("sunday");
         case 2 ->
         System.out.println("Monday");
         case 3 ->
         System.out.println("Tuesday");
         case 4 ->
         System.out.println("Wednesday");
         case 5 ->
         System.out.println("Thursday");
         case 6 ->
         System.out.println("Friday");
         case 7 ->
         System.out.println("Saturday");
         default ->
         System.out.println("invalid day");
         }
	}

}
