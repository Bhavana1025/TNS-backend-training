//implicit type casting
public class TypeCasting {

	public static void main(String[] args) {
		int x = 10;
		double y = x;
		System.out.println(y);
		//explicit type casting
		double z =29.99;
         int w = (int)x;
         System.out.println(z);
         System.out.println(w);
		char ch = 'Z';
		int u = ch;
		System.out.println(ch);
		System.out.println(u);
//		int num = 1000;
//		byte x = (byte) num;
//		System.out.println(num);
//		System.out.println(x);
		//here 1byte= 8bits so range is upto -128 to 127 overflow
		}

}
