package arrays.problems;

import java.util.Arrays;
import java.util.Scanner;

public class ReversingAnArray {

    // Scan a N
    // Scan N numbers & store them in an array
    // Reverse that array
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("---reversing array---");
        // reversing swap i and N - i - 1 elements till i = N / 2
        for (int i = 0; i < N / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[N - 1 - i];
            arr[N - 1 - i] = temp;
        }

        Arrays.stream(arr).forEach(System.out::println);


        // using two pointers
        int i = 0, j = N - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
