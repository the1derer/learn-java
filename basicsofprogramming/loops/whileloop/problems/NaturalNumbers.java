package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int N = stdin.nextInt();

        int i = 1;
        // while (i++ <= N) { // incrementing 'i' here will give wrong answer as we are going to use the value of i
        while (i < N) {
            System.out.print(i++ + " ");
        }
        System.out.println(N); // Note: we printed this 'N' out of while loop to avoid adding extra <space> at the end

        // we can avoid printing last 'N' out of loop by using if-else condition

        i = 1;
        while (i <= N) {
            if (i != N) {
                // System.out.print(i++ + " -> "); // printf is better suited here
                System.out.printf("%d -> ", i++);
            } else {
                System.out.printf("%d", i++);
            }
        }
        System.out.println();

        // sum of N number
        i = 0;
        int sum = 0;
        while (i <= N) {
            sum = sum + i++;
        }

        System.out.println(sum);

        // also instead of using while-loop(which will have O(N) complexity) we can use sumOfNumber = N(N+1)/2 formula
        sum = N * (N + 1) / 2;
        System.out.println(sum);
        


    }
}
