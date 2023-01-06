package arrays.problems;

import java.util.Arrays;

public class InsertInArray {
    // let 'i' be the insertion index
    // The idea here is to shift all the elements of the array from the 'i'th position to the right by 1 position.
    // insert the element at i

    public static void main(String[] args) {

        System.out.println("------if not filled till capacity----");
        /*
         * Steps would be as follows:
         * 1. Slide the elements one place to the right
         * 2. Insert the element
         */

        int[] arrayNotFilled = new int[10];
        arrayNotFilled[0] = 2;
        arrayNotFilled[1] = 1;
        arrayNotFilled[2] = 9;
        arrayNotFilled[3] = 3;
        arrayNotFilled[4] = 5;

        Arrays.stream(arrayNotFilled).forEach(j -> System.out.print(j + " "));

        int index = 2, value = 6;  // considering index starts from 0, if want to consider start-index =  1, then just do `--i`;

        int noOfElements = 5 ; // no of elements in array

        // Step-1: sliding elements

        for (int j = noOfElements - 1; j >= index; j--) {
            // swapping arr[j] and arr[j + 1]
            int temp = arrayNotFilled[j];
            arrayNotFilled[j] = arrayNotFilled[j + 1];
            arrayNotFilled[j + 1] = temp;
        }

        System.out.println("\nArray after sliding");
        Arrays.stream(arrayNotFilled).forEach(j -> System.out.print(j + " "));

        arrayNotFilled[index] = value;
        System.out.println("\nArray after inserting x");
        Arrays.stream(arrayNotFilled).forEach(j -> System.out.print(j + " "));




        System.out.println("\n----if array is filled till capacity----");
        int[] filledArray = {2, 1, 0, 3, 5};

        Arrays.stream(filledArray).forEach(j -> System.out.print(j + " "));

        index = 2; value = 6;

        System.out.println("---Using 2 for loops---");
        int[] tempArr = new int[filledArray.length + 1];
        for (int j = 0; j < index; j++) {
            tempArr[j] = filledArray[j];
        }
        tempArr[index] = value;
        for (int j = index; j < filledArray.length; j++) {
            tempArr[j + 1] = filledArray[j];
        }
        System.out.println();
        filledArray = tempArr;
        tempArr = null;

        Arrays.stream(filledArray).forEach(j -> System.out.print(j + " "));

        System.out.println("\n----using a single for loop----");
        index = 3; value = 7;
        tempArr = new int[filledArray.length + 1];
        for (int j = 0, l = 0; j < tempArr.length && l < filledArray.length; j++, l++) {
            if (j == index) {
                tempArr[j] = value;
                j++;
            }
            tempArr[j] = filledArray[l];
        }

        filledArray = tempArr;
        tempArr = null;
        Arrays.stream(filledArray).forEach(j -> System.out.print(j + " "));
    }
}
