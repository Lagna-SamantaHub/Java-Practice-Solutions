package java_practice;

public class NumberPattern1 {

	public static void main(String[] args) {
		int n=5;
		System.out.println("**********Pattern 1**************");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println("");
		}
		System.out.println("**********Pattern 2**************");
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println("");
		}


	}

}
//1
//12
//123
//1234
//12345