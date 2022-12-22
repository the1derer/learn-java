package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class PrintingStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        // logic is for 'i'th lines we want to print 'i' stars.

        int i = 1;
        while (i <= N) {
            int j = 1;
            while (j++ <= i) {
                System.out.print("*");
            }

            System.out.println();
            i++;
        }
    }
}
