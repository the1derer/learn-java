package arrays.two_dimension_array.problems;

public class AddTwoMatrix {
    public static void main(String[] args) {
        // int[][] A = new int[3][4], B = new int[3][4];

        int[][] A = {
            {1, 2, 3, 11},
            {4, 5, 6, 12},
            {7, 8, 9, 13}
        };

        int[][] B = {
            {1, 5, 7, 10},
            {2, 10, 7, 8},
            {10, 78, 55, 11},
        };

        // check if columns and rows are of same length
        boolean canBeAdded = true;
        if (A.length != B.length) {
            canBeAdded = false;
        } else {
            // now check equality of length of each row
            // if (A[i].length != B[i].length) canBeAdded = false;
        }

        // can do without 'C' just change value in either A or B by adding value of another
        int[][] C = new int[3][4];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("############");

        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }

            System.out.println();
        }


    }
}
