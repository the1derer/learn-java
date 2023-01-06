package arrays.two_dimension_array.problems;

public class TriangularPartsMatrix {
    public static void main(String[] args) {
        /*
         *           |  Lower part
         * 1 2 4 6   |  i = 0 -> 1
         * 0 2 3 2   |  i = 1 -> 0, 2
         * 0 9 1 3   |  i = 2 -> 0, 9, 1
         * 2 3 2 2   |  i = 3 -> 2, 3, 2, 2
         */

        int[][] matrix = {
            {1, 2, 4, 6},
            {0, 2, 3, 2},
            {0, 9, 1, 3},
            {2, 3, 2, 2}
        };

        System.out.println("---lower triangle part---");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("---upper triangle part---");
        for (int i = 0; i < matrix.length; i++) {

            // loop to print spaces (to make visualization easier)
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
