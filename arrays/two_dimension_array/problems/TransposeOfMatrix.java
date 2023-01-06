package arrays.two_dimension_array.problems;

// only for square matrix
public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 14},
            {4, 5, 6, 15},
            {7, 8, 9, 16},
            {10, 11, 12, 13}
        };

        // iterating entire matrix will perform swap 2 times hence giving us the same matrix
        // To resolve this either use a separate matrix (not in-place) or just swap the elements above or below right diagonal(in-place)
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         // swapping a[i][j] & a[j][i]
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[j][i];
        //         matrix[j][i] = temp;
        //     }
        // }

        // swap number along the right diagonal
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                // swapping a[i][j] & a[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // static void swap(int[][] matrix, int )
}
