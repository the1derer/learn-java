package arrays.problems;

import java.util.Arrays;

public class DeleteInArray {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 5;
        arr[3] = 6;
        arr[4] = 9;

        Arrays.stream(arr).forEach(idx -> System.out.print(idx + " "));
        System.out.println();

        int i = 2 /*index to be deleted */, k = 5 /* number of elements */;

        for (int j = i + 1; j < k; j++) {
            arr[j - 1] = arr[j];
            // arr[j] = 0; // don't care what is present after the last element
        }

        Arrays.stream(arr).forEach(idx -> System.out.print(idx + " "));
    }
}
