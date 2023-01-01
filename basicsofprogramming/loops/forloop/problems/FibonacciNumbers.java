package basicsofprogramming.loops.forloop.problems;

import java.util.Scanner;

// fibonacci numbers
// first 2 are 0, 1
// then t(i) = t(i -1) + t(i - 2)
// 0, 1, 1, 2, 3, 5,...

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        if (N == 0) {
            System.out.println(0);
        } 
        // else if (N == 1) { // not needed in case of PPa's soln
            // System.out.println(1);
        // }
        else {

            // int t0 = 0, t1 = 1;
            // int ti = 0;
            // for (int i = 2; i <= N; i++) {
            //     ti = t0 + t1;
            //     t0 = t1;
            //     t1 = ti;
            // }
            // System.out.println(ti);

            // PPa Soln -> better variable name and one less variable
            int prev = 0, curr = 1;
            for (int i = 2; i <= N; i++) {
                int iVal = prev + curr;
                prev = curr;
                curr = iVal;
            }
            System.out.println(curr);
        }

        // TODO: printing all fibonacci numbers till N


    }

    // using recursion
    // static int recurseFibonacci(int N) {
    // if (N == 0) {
    // return 0;
    // } else if (N == 1) {
    // return 1;
    // } else {
    // return fibonacci(N - 1) + fibonacci(N - 2);
    // }
    // }
}

/*
 * Notes:
 * Took a lot of time to get the solution on my own and PPa's soln is much more elegant.
 */
