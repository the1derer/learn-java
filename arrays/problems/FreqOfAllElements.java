package arrays.problems;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FreqOfAllElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = Arrays.stream(input.nextLine().split("\\s+"))
                        .mapToInt(s -> Integer.parseInt(s))
                        .toArray();
        
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i], freq = 0;

            for (int j = 0; j < arr.length; j++) {
                if (val == arr[j]) freq++;
            }

            System.out.print(freq + " ");
        }
    }
}
