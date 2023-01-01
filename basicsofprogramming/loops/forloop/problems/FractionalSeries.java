package basicsofprogramming.loops.forloop.problems;

import java.util.Scanner;

public class FractionalSeries {
    // series -> 1, 1/2, 1/3, 1/4, 1/5
    // ith term -> 1/i
    // I/P: int N
    // O/P: sum of first N terms
    // eg. N = 2, O/P = 1 + 1/2 = 1.5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        double sum = 0;
        for (int i = 1; i <= N; i++) {
            double ti = (double) 1 / i;
            sum += ti; 
        }

        System.out.println(sum);
    }
}
