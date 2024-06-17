package java_practice;

public class ReverseNum {

	public static void main(String[] args) {
		int n=12345,rev=0,reminder=0;
		System.out.println("Input Number="+n);
		while(n!=0) {
			reminder=n%10;
			rev=rev*10+reminder;
			n=n/10;
		}
		System.out.println("Reversed Number="+rev);

	}

}
