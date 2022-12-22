package basicsofprogramming.decisionmaking.findminmax;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int x = stdin.nextInt(), y = stdin.nextInt(), z = stdin.nextInt();

        // second maximum element
        // approach is:
        // First you find the max element
        // Then find the max element in remaining integers, for than we used nested if-else
        int max, secondMax;
        if (x >= y && x >= z) {
            max = x;
            if (y >= z) {
                secondMax = y;
            } else {
                secondMax = z;
            }
        } else if (y >= x && y >= z) {
            max = y;

            if (x >= z) {
                secondMax = x;
            } else {
                secondMax = z;
            }
        } else {
            max = z;
            if (x >= y) {
                secondMax = x;
            } else {
                secondMax = y;
            }
        }

        System.out.println(secondMax);
    }
}
