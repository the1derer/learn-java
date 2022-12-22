package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class GCDofTwoNum {

    // a, b : find GCD/HCF: Greatest Common Divisor/Highest Common Factor
    // 6, 14
    // factors of 6: 1, 2, 3, 4
    // factors of 14: 1, 2, 7, 14
    // GCD = 2

    // 1 <= GCD(x, y) <= Min(x, y)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt(), b = input.nextInt(), min, gcd = 1;

        if (a < b) {
            min = a;
        } else {
            min = b;
        }

        int i = 1;
        while (i <= min) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
            i++;
        }

        System.out.println(gcd);
    }
}
