package java_io.charstream.scanner;

import java.util.Scanner;

public class ScannerDemo {
    /*
     * High level stream 
     * More or less like String/Stream Tokenizer
     * This also breaks Streams to Tokens
     * But we can't give delimiters of choice. Predefined delimiters like space, tab and newline.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        float f1 = sc.nextFloat();
        long l1 = sc.nextLong();
        System.out.println(i + d + f1 + l1);
        System.out.println(sc.next());

        // taking data line-by-line from keyboard
        String s1 = "";
        while(!s1.equals("stop")) {
            s1 = sc.nextLine();
            System.out.println(s1);
        }
     }
}
