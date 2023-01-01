package basicsofprogramming.loops.forloop.problems;

import java.util.Scanner;

public class SumOfTerms1 {
    // series -> 1, x, x^2 / 2!, x^3 / 3!, x^4 / 4! ...
    // I/P: x, N
    // O/P: sum of series for first N terms

    // i term => x^i / i! (series starts from i = 0)

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(), x = input.nextInt();

        System.out.println("---Summing after computing every term separately---");
        long start = System.nanoTime();
        double sum = 0;
        for (int i = 0; i <= N; i++) {
            long pow = 1, factorial = 1;
            for (int j = 1; j <= i; j++) {
                pow *= x;
                factorial *= j;
            }
            double t_i = (double) pow / factorial;
            sum += t_i;
        }
        System.out.println(sum);
        System.out.println("Time taken: " + (System.nanoTime() - start) / 1000); // Time Complexity = 1 + 2 + 3 + ... + N =  N * (N + 1) / 2 = O(N^2)

        System.out.println("---Optimized Soln---");
        start = System.nanoTime();
        // another(smarter) way to do this
        // t(i) = t(i-1) * (x / i)

        // my solution: I am starting i from 1, as i = 0 was causing issue
        double curr = 1;
        sum = 1;
        for (int i = 1; i <= N; i++) { // Note: Don't start from 0 as it will cause issue when dividing
            curr *= ((double) x / i);
            sum += curr;
        }
        System.out.println(sum);
        System.out.println("Time taken: " + (System.nanoTime() - start) / 1000); // O(N)

        System.out.println("----PPa soln---");
        start = System.nanoTime();
        double ans = 0, prod = 1, fact = 1;
        for (int i = 0; i <= N; i++) {
            ans += prod / fact;
            prod *= x;
            fact *= (i + 1);
        }
        System.out.println(ans);
        System.out.println("Time taken: " + (System.nanoTime() - start) / 1000); // O(N) // TODO: Find out why PPa's soln is taking 2.5 times less times
    }
}
