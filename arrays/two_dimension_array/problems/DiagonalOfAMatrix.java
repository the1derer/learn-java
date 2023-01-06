package arrays.two_dimension_array.problems;

public class DiagonalOfAMatrix {
    // find the sum of both right-diagonal and left-diagonal
    public static void main(String[] args) {
        int[][] twoDimArr = {
            {1, 2, 3, 11},
            {4, 5, 6, 12},
            {6, 8, 9, 13}
        };

        // O(n^2) approach
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr.length; j++) {
                if (i == j) {
                    System.out.print(twoDimArr[i][j] + " ");
                }
            }
        }
        System.out.println();

        // right diagonal
        for (int i = 0, j = 0; i < twoDimArr.length && j < twoDimArr[i].length; i++, j++) {
            System.out.print(twoDimArr[i][j] + " ");
        }

        System.out.println();

        // left diagonal
        for (int i = 0, j = twoDimArr[i].length - 1; i < twoDimArr.length && j >= 0; i++, j--) {
            System.out.print(twoDimArr[i][j] + " ");
        }
        System.out.println();

        // if dealing with square matrix
        for (int i = 0; i < twoDimArr.length; i++) {
            System.out.print(twoDimArr[i][i] + " ");
        }

        System.out.println();

        // total sum of elements along diagonal
        int[][] twoDimArr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {6, 8, 9}
        };

        int rightSum = 0, leftSum = 0;
        for (int i = 0; i < twoDimArr.length; i++) {
            rightSum += twoDimArr2[i][i];
            leftSum += twoDimArr2[i][twoDimArr2.length - 1 - i];
        }

        int repeated = 0;;

        // in case of square matrix with odd number of rows, center element is added twice
        if (twoDimArr2.length % 2 != 0) {
            repeated = twoDimArr2[twoDimArr2.length/2][twoDimArr2.length/2];
        }

        int totalSum = rightSum + leftSum - repeated;
        System.out.println(totalSum);
    }
}
