package basicsofprogramming.loops.whileloop.problems;

import java.io.Console;

public class MultiplicationTable {
    public static void main(String[] args) {
        Console cs = System.console();

        int n = Integer.parseInt(cs.readLine("Enter the integer whose table you want to generate: "));
        
        int N = Integer.valueOf(cs.readLine("Enter length of multiplication table: "));

        int i = 1;

        while (i <= N) {
            System.out.printf("%d x %d = %d\n", n, i , n * i++);
        }

    }
}
