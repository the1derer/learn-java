package arrays.problems;

import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr;
        int size = input.nextInt();
        arr = new int[size];

        // int max = arr[0]; // but this will give IndexOutOfBounds exception in case of empty array

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);


        /* Note (VVImp): Here the idea is the variable 'max' or 'min' tells us about the maximum and minimum in the Prefix of array respectively. 
         * Arr = {a0, a1, a2...}
         * Max[0...4] = max(Max[0...3], a4)
         */
    }
}
