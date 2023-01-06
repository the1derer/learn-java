package arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[3] = 20; // Runtime Error
        marks[-1] = 30; // runtime error

        int[] arr = new int[-10]; // runtime error

        // int[] arr1 = new int[10000000000000L]; // size can only be b/w 0 & 'Integer.MAX_VALUE'

        int[] arr2;
        // arr2[8] = 0; // compilation error

        int[] arr3 = {1, 2, 3, 4};

        // arr3 = {4, 5, 6}; // compilation error, "Array constants can only be used in initialization"

        int N;
        // int[] arr4 = new int [N]; // compilation error as 'N' has not been 
        N = 10;
        int[] arr4 = new int [N];
    }
}
