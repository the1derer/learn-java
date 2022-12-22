package basicsofprogramming.decisionmaking;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n % 2 == 0) {
             System.out.println("EVEN");
        }
        if(n % 2 != 0) {
            System.out.println("ODD");
        }
        // if(!n % 2 == 0) { // error, as `!` has more priority than '%' and `==` so will be evaluated first
        if(!(n % 2 == 0)) {
            System.out.println("ODD");
        }

        // multiple condition in if-statement
        if((n % 2 == 0) && (n > 10)) {
            System.out.println("EVEN and greater than 10");
        }
    }
}
 