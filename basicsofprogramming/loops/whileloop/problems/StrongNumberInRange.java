package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class StrongNumberInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(), num = 1;

        while (num <= N) {
            int temp = num, dFactSum = 0;

            while (temp > 0) {
                int digit = temp % 10, dFact = 1;

                while (digit > 0) {
                    dFact *= digit;
                    digit--;
                }
                dFactSum += dFact;
                temp /= 10;
            }

            if (num == dFactSum) {
                System.out.print(num + " ");
            }

            num++;
        }
    }
}
