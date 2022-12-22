package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class DigitsPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        // handing corner case of N = 0
        if (N == 0) {
            System.out.println(0);
        }

        // while (N != 0) { // this is also OK
        while (N > 0) {
            System.out.println(N);
            N /= 10;
        }

        // below will also work in C/C++ (but not in Java, as `int` and `boolean` can't be casted) as N eventually becomes zero
        // while (N) {
        //     N /= 10;
        // }
    }
}
