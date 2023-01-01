package math_class.problem;

import java.io.Console;

public class CalculateCeilFloor {
    public static void main(String[] args) {
        // Given a number find its ceil and find its floor w/o using `Math` class
        Console cs = System.console();

        double N = Double.parseDouble(
                cs.readLine("Please enter the number whose ceil and floor you want to find: "));

        int ceil, floor;

        double integer = (int) N;

        if (N - integer == 0) {
            ceil = (int) N;
            floor = (int) N;
        } else {
            floor = (int) N;
            if (N < 0) {
                floor -= 1;
            }

            ceil = (int) N;
            if (N > 0) {
                ceil += 1;
            }
        }

        System.out.println("Floor of N: " + floor);
        System.out.println("Ceil of N: " + ceil);
    }
}
