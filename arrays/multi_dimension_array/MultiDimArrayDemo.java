package arrays.multi_dimension_array;

public class MultiDimArrayDemo {
    public static void main(String[] args) {
        int[][][][] multiDimensionArray = new int[2][2][2][2]; // 4-D array


        // 3-d arrays can be seen as arrays of 2-d arrays
        int[][][] threeDimensionArray =
                // new int[2][2][2];
                {
                    {{1, 0}, {0, 1}},
                    {{2, 0, 1}, {0, 2}, {3, 4, 5, 6}} 
                };

        for (int i = 0; i < threeDimensionArray.length; i++) {
            for (int j = 0; j < threeDimensionArray[i].length; j++) {
                for (int k = 0; k < threeDimensionArray[i][j].length; k++) {
                    System.out.print(threeDimensionArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // TODO: Scan, sum etc operation with 4-D matrix
    }
}
