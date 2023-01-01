package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class ReverseDigitsPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        
        // int noOfDigits = 0;
        // int temp = N;

        // while (temp != 0) {
        //     temp /= 10;
        //     noOfDigits++;
        // }

        // System.out.println(noOfDigits);

        // int multipleOf10 = 1;
        // while (noOfDigits - 1 > 0) {
        //     multipleOf10 *= 10;
        //     noOfDigits--;
        // }

        // we can combine above two loops into 1 loop

        int multipleOf10 = 1;
        // int temp = N;

        // while (temp > 9) {
        //     multipleOf10 *= 10;
        //     temp /= 10;
        // }

        // without using 'temp' variable
        while (N/multipleOf10 > 9) {
            multipleOf10 *= 10; // divide as many times as you want the digit to be gone
        }

        while (multipleOf10 > 0) {
            System.out.println(N / multipleOf10);
            multipleOf10 /= 10;
        }
    }
}
