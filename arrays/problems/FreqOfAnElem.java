package arrays.problems;

import java.util.Scanner;

/**
 * FreqOfAnElem
 */
public class FreqOfAnElem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        int x = input.nextInt(), freq = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] == x) {
                freq++;
            }
        }

        System.out.println(freq);
    }
}