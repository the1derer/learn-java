package arrays.two_dimension_array;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDimArrayDemo {
    public static void main(String[] args) {
        int rows = 4, columns = 3;
        int[][] x;

        x = new int[rows][];
        
        int[] z = {1, 2, 3};
        x[0] = z;

        x = new int[rows][columns];

        int x1[][] = {{10 ,20, 30}, {10, 20, 39, 49}, {10, 20}};
        int x2[][] = {
            {10, 20, 30},
            {10, 20, 39, 49},
            {10, 20}
        };

        for (int i = 0; i < x1.length; i++) {
            for (int j = 0; j < x1[i].length; j++) {
                System.out.print(x1[i][j] + " ");
            }
            System.out.println();
        }

        // anonymous arrays of array
        // new int[] {
        //     {10, 20, 30},
        //     {10, 20, 39, 49},
        //     {10, 20}
        // }

        System.out.println("-----------------scanning data into 2-D array----------------");

        Scanner input = new Scanner(System.in);
        

        System.out.println("---------rows with same column length---------");
        System.out.print("Enter rows: ");
        rows = input.nextInt();

        System.out.print("Enter Columns: ");
        columns = input.nextInt();
        int[][] twoDimArr = new int[rows][columns];

        System.out.println("----scanning and printing row wise data----");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDimArr[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----scanning and printing column wise data----");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                twoDimArr[j][i] = input.nextInt();
            }
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(twoDimArr[j][i] + " ");
            }
            System.out.println();
        }




        System.out.println("---------rows with different column length---------");
        twoDimArr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            System.out.printf("Enter columns for %d row: ", i);
            columns = input.nextInt();
            twoDimArr[i] = new int[columns];

            for (int j = 0; j < columns; j++) {
                twoDimArr[i][j] = input.nextInt();
            }
        }

        // Arrays.stream(twoDimArr).forEach(oneDimArr -> {
        //     Arrays.stream(oneDimArr).forEach(i -> System.out.print(i + " "));
        // });
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                System.out.print(twoDimArr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
