package java_practice;

public class ReverseStringwithInbuildMethod {

	public static void main(String[] args) {
// StringBuilder is not synchronized, which makes it faster than StringBuffer, but it is not thread-safe and should not be used in a multithreaded environment.
		StringBuilder s=new StringBuilder("Lagna Samanta");
		System.out.println("Input String  : "+s);
		System.out.println("Reversed String with StringBuilder: "+s.reverse());
		
//StringBuffer is synchronized, meaning its methods are thread-safe and can be safely used in a multithreaded environment. On the other hand		
		StringBuffer s1=new StringBuffer("Lagna Samanta");//
		//System.out.println("Input String with StringBuffer :"+s);
		System.out.println("Reversed String with StringBuilder: "+s1.reverse());

	}

}
