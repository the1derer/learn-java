package inputoutput.charstream.scanner;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------Read type specific token------------");
        int i = sc.nextInt();
        double d = sc.nextDouble();
        float f1 = sc.nextFloat();
        long l1 = sc.nextLong();

        System.out.println(i + d + f1 + l1);
        
        //-----------------------------------

        System.out.println("------------Read next token(non type specific)-------------------");
        System.out.println(sc.next());

        System.out.println("-----------------Reading data line by line from keyboard--------------s");
        // taking data line-by-line from keyboard
        String s1 = "";
        while(!s1.equals("stop")) {
            s1 = sc.nextLine();
            System.out.println(s1);
        }
     }
}
