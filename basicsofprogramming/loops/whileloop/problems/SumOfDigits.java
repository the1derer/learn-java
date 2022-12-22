package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long N = input.nextLong();
        long sumOfDigits = 0;

        while (N != 0) {
            int digit = (int) (N % 10);
            sumOfDigits += digit;
            N /= 10;
        }

        System.out.println("sum of digits: " + sumOfDigits);
    }
}
