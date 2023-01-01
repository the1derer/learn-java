package basicsofprogramming.loops.forloop.problems;

import java.util.Scanner;

public class SpecialSeries {
    // series -> 1, 11, 111, 1111, 11111....
    // I/P: int N
    // O/p: sum of first N terms of series
    // eg. -> N = 3 , O/P: 1 + 11 + 111 = 123

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        // int sum = 0;
        // for (int i = 1; i <= N; i++) {
        //     int iterm = 0;
        //     for (int j = 0; j <= i - 1; j++) {

        //         int tenMul = 1;
        //         for (int k = 1; k <= j; k++) {
        //             tenMul *= 10;
        //         }
        //         iterm += tenMul;
        //     }
        //     System.out.println(iterm);

        //     sum += iterm;
        // }
        // System.out.println(sum);

        // using pattern
        // t(i) = (t(i-1) * 10) + 1
        long curr = 0, sum = 0;
        for (int i = 1; i <= N; i++) {
            curr = curr * 10 + 1;
            System.out.println(curr);
            sum += curr;
        }
        System.out.println(sum);


    }
}

/*
 * Without hint didn't think of pattern.
 * Was able to get correct pattern with hint.
 */