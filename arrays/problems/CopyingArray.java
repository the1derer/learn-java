package arrays.problems;

import java.util.Arrays;
import java.util.stream.Stream;

public class CopyingArray {
    // Given an array of some size
    // copy the elements of this array to another array

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 10, -10,};

        int[] arr2 = arr; // this is not copy, we are just storing ref. of 'arr' in 'arr2' too.

        int[] copiedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copiedArray[i] = arr[i];
        }
        Arrays.stream(copiedArray).forEach(System.out::println);


        // using built-in `System.arrCopy()` method
        int[] inbuildMethodCopy = new int[arr.length];
        Arrays.stream(inbuildMethodCopy).forEach(System.out::println);
        System.arraycopy(copiedArray, 0, inbuildMethodCopy, 0, 4);
        Arrays.stream(inbuildMethodCopy).forEach(System.out::println);
    }
}
