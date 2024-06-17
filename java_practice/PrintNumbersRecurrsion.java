package java_practice;

public class PrintNumbersRecurrsion {

	public static void main(String[] args) {
		// Print number 1-10 ,without using loops- use recursion
		int n=10;
		print(n);;

	}
	public static void print(int n) {
		
		if(n<1) {
			return;
		}
		print(n-1);
		 System.out.println(n);	
	
	}
	

}
