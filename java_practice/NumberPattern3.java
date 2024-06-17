package java_practice;

public class NumberPattern3 {

	public static void main(String[] args) {
		int n=9;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==1) {
						System.out.print(i);
						break;
				}
				else {
					System.out.print(i);
				}
			}
			System.out.println("");
		}


	}

	}
//1
//22
//3
//4444
//5
//666666
//7
//88888888
//9