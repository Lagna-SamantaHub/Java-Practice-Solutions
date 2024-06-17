package java_practice;

public class ReverseStringExample {

    public static void main(String[] args) {
        // Method 1: Reverse a string without using in-built methods
        String s = "Lagna Samanta";
        System.out.println("Input String: " + s);
        String revstr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revstr = revstr + s.charAt(i);
        }
        System.out.println("Reversed String (without in-built method): " + revstr);

        // Method 2: Reverse a string using StringBuilder
        // StringBuilder is not synchronized, which makes it faster than StringBuffer,
        // but it is not thread-safe and should not be used in a multithreaded environment.
        StringBuilder s1 = new StringBuilder("Lagna Samanta");
        System.out.println("Input String: " + s1);
        System.out.println("Reversed String (with StringBuilder): " + s1.reverse());

        // Method 3: Reverse a string using StringBuffer
        // StringBuffer is synchronized, meaning its methods are thread-safe and can be
        // safely used in a multithreaded environment.
        StringBuffer s2 = new StringBuffer("Lagna Samanta");
        System.out.println("Input String: " + s2);
        System.out.println("Reversed String (with StringBuffer): " + s2.reverse());
    }
}
