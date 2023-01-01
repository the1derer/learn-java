package basicsofprogramming.loops.problems;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        // int tenMultiple = 1; //, temp = N;
        // while (N / tenMultiple > 9) {
        //     tenMultiple *= 10;
        // }
        // int reverseN = 0;
        // for (; N > 0  /* or tenMultiple > 0 */; N /= 10, tenMultiple /= 10) {
        //     reverseN += (N % 10) * tenMultiple;
        // }
        // System.out.println(reverseN);


        // Vivek sir's method
        // count the digits and use Math.pow() method
        // Using Math.pow will make the time complexity O(N^2)

        // TODO: can we do the job in one (while-)loop?

        // using the same technique as in pattern 1, 11, 111, 1111....
        // 6275 :-->
        // 5
        // 5 * 10 + 7 = 57
        // 57 * 10 + 7 = 572
        // 572 * 10 + 6 = 5726
        int reverseN = 0;
        while (N > 0) {
            reverseN = reverseN * 10 + (N % 10);
            N /= 10;
        }
        System.out.println(reverseN);
    }
}

// I/P: 2345678
// O/P: 8765432
