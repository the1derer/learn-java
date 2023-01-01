package arrays.problems;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        int[] marks = new int[3];
        
        Scanner input = new Scanner(System.in);

        // marks[0] = input.nextInt();
        // marks[1] = input.nextInt();
        // marks[2] = input.nextInt();
        // double avg = (marks[0] + marks[1] + marks[2]) / 3.0; // here we put '3.0' instead of '3' to get double result.

        // // in above we scanned and then added the number one by one, which could not scale to arrays of large length
        // // To overcome this we use loops
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

        int sum = 0;
        for (int mark : marks) { // enhanced for-loop
            sum += mark;
        }

        double avg = sum / (marks.length * 1.0);

        System.out.println(avg);
    }
}
