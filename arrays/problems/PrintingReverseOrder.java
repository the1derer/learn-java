package arrays.problems;

import java.util.Scanner;

public class PrintingReverseOrder {
    // Scan a N
    // Scan N integers
    // Print those integers in reverse order
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int N = input.nextInt();

        int[] arr = new int[N];

        System.out.println("Please enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
