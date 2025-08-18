
public class forloopPattern {

	public static void main(String[] args) {
		int n = 5;//number of rows
		for(int i=n; i>=1 ;i--) {
			for(int j=1;j<=i;j++) {
			System.out.print("*");//if we keep println here we get all stars in one column only bcz  ln is used for print one * in first column another 2 * will print in next line 
			}
			System.out.println();	
			//pattern
//			int n = 5;//number of rows
//			for(int i=1; i<=n ;i++) {
//				for(int j=1;j<=i;j++) {
//				System.out.print("*");//if we keep println here we get all stars in one column only bcz  ln is used for print one * in first column another 2 * will print in next line 
//				}
//				System.out.println();	


}
}
}