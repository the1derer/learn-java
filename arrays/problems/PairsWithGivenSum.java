package arrays.problems;

import java.util.Arrays;
import java.util.Scanner;

public class PairsWithGivenSum {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] arr = Arrays.stream(input.nextLine().split("\\s+"))
                        .mapToInt(s -> Integer.parseInt(s))
                        .toArray();
        int x = input.nextInt(), N = arr.length;
        for (int i = 0; i < N; i++) {
            
            for (int j = i + 1; j < N; j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
     }
}
