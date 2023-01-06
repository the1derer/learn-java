package arrays.two_dimension_array.problems;

public class MultiplyTwoMatrices {
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}

            // {1, 2, 3, 4},
            // {5, 6, 7, 8},
            // {0, 9, 10, 11},
            // {12, 13, 14, 15}
        };

        int[][] matrix2 = {
            {7, 8},
            {9, 10},
            {11, 12}

            // {1, 2, 3, 4},
            // {5, 6, 7, 8},
            // {0, 9, 10, 11},
            // {12, 13, 14, 15}
        };

        // check if both matrices can be multiplied
        // matrix1 X matrix2 ==> #columns(matrix1) == #rows(matrix2)
        int[][] mulMatrix = new int[matrix1.length][matrix2[0].length];

        // N = mulMatrix.length;

        for (int i = 0; i < mulMatrix.length; i++) {
            for (int j = 0; j < mulMatrix[i].length; j++) {
                // for (int k = 0, l = 0; k < matrix1[i].length && l < matrix2.length; k++, l++) { // since #columns(matrix1) == #rows(matrix2), this means k = l
                for (int k = 0; k < matrix1[i].length; k++) {
                    mulMatrix[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }

        for (int i = 0; i < mulMatrix.length; i++) {
            for (int j = 0; j < mulMatrix[i].length; j++) {
                System.out.print(mulMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
