package basicsofprogramming.loops.whileloop.problems;

import java.util.Scanner;

public class StrongNumbers {

    // want to learn nested loop so don't use function
    // static int getFactorial(int n) {
    //     int factorial = 1;
    //     while (n > 0) {
    //         factorial *= n;
    //         n--;
    //     }
    //     return factorial;
    // }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(), temp = N; // using `temp` to preserve the original value
        long factSum = 0;

        // handling edge case, N = 0, 0! is 1
        if (N == 0) {
            System.out.println("Not Strong Number");
        }
        
        while (temp > 0) {
            int digit = temp % 10;
            
            // factSum += getFactorial(digit);
            int dfact = 1;
            while (digit > 0) {
                dfact *= digit;
                digit--;
            }
            factSum += dfact;

            temp /= 10;
        }

        if (factSum == N) { // long and int are comparable
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a strong number");
        }
    }
}
