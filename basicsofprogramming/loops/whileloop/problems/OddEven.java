package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();
        
        int cOdd = 0;
        int iOdd = 1;
        while (cOdd++ < N) {
            System.out.print(iOdd + " ");
            iOdd += 2;
        }

        System.out.println("\nPrinting even number");

        int cEven = 0;
        int iEven = 2;
        while (cEven++ < N) {
            System.out.print(iEven + " ");
            iEven += 2;
        }

        // TODO: Do in one loop
    }
}
