package basicsofprogramming.decisionmaking.findminmax;

import java.util.Scanner;

public class FindMaxMinDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt(), y = input.nextInt(x);

        // comparing two value
        if (x > y) {
            System.out.println(x);
        } else { // it will catch 'x >= y'
            System.out.println(y);
        }

        // comparing 3 values
        int z = input.nextInt();

        // nested if-else => not recommended
        if (x > y) {
            if (x > z) {
                System.out.println(x);
            } else {
                System.out.println(z);
            }
        } else {
            if (y > z) {
                System.out.println(y);
            } else {
                System.out.println(z);
            }
        }

        // using multiple conditions in if
        if ((x >= y) && (x >= z)) {
            System.out.println(x);
        } else if ((y >= x) && (y >= z)) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

        // no. of elements equal to maximum
        // introduce a variable max, and after finding the max as above, compare it to all the elements
        int max;
        if ((x >= y) && (x >= z)) {
            max = x;
            System.out.println(x);
        } else if ((y >= x) && (y >= z)) {
            max = y;
            System.out.println(y);
        } else {
            max = z;
            System.out.println(z);
        }

        int count = 0;

        if (x == max) {
            count++;
        }
        if (y == max) {
            count++;
        }
        if (z == max) {
            count++;
        }
        System.out.println(count);


        // finding minimum
        if ((x <= y) && (x <= z)) {
            System.out.println(x);
        } else if ((y <= x) && (y <= z)) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

    }
}

/*
 * 1. find minimum of 3 elements
 * 2. no. of elements equals to the maximum
 * 3. Second maximum element
 */
