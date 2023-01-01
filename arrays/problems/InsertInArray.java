package arrays.problems;

import java.util.Arrays;

public class InsertInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Arrays.stream(arr).forEach(j -> System.out.print(j + " "));

        int i = 2, x = 6;

        int[] tempArr = new int[arr.length + 1];
        for (int j = 0; j < i; j++) {
            tempArr[j] = arr[j];
        }
        tempArr[i] = x;
        for (int j = i + 1; j < tempArr.length; j++) {
            tempArr[j] = arr[j - 1];
        }
        System.out.println();
        arr = tempArr;
        tempArr = null;

        Arrays.stream(arr).forEach(j -> System.out.print(j + " "));

        System.out.println("\n----------using a single for loop-------");
        i = 3; x = 7;
        tempArr = new int[arr.length + 1];
        for (int j = 0, k = 0; j < tempArr.length && k < arr.length; j++, k++) {
            if (j == i) {
                tempArr[j] = x;
                j++;
            }
            tempArr[j] = arr[k];
        }

        arr = tempArr;
        tempArr = null;
        Arrays.stream(arr).forEach(j -> System.out.print(j + " "));
    }
}
